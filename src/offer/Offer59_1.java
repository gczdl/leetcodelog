package offer;

import java.util.ArrayList;
import java.util.List;

public class Offer59_1 {
    public static void main(String[] args) {
        Offer59_1.Solution solution = new Offer59_1().new Solution();
        int[] ints = solution.maxSlidingWindow(new int[]{1,3,1,2,0,5}, 3);
    }

    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            if(nums.length==0) return new int[0];
            int l=0,r=k-1;
            int max=0;
            for(int i=1;i<k;i++){
                max=nums[i]>=nums[max]?i:max;
            }
            List<Integer> list=new ArrayList<>();
            list.add(nums[max]);
            while (r<nums.length-1){
                //如果可以就更新max
                max=nums[++r]>=nums[max]?r:max;
                //最大值要过期,遍历设置新max
                if(max<++l){
                    max=l;
                    for(int i=l+1;i<=r;i++){
                        max=nums[i]>=nums[max]?i:max;
                    }
                }
                list.add(nums[max]);
            }
            int[] res=new int[list.size()];
            for (int i=0;i<list.size();i++){
                res[i]=list.get(i);
            }
            return res;
        }
    }
}
