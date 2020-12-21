package offer;

public class Offer42 {

    public static void main(String[] args) {
        Offer42.Solution solution=new Offer42().new Solution();
        int i = solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        System.out.println(i);
    }

    class Solution {
        public int maxSubArray(int[] nums) {
            if(nums==null||nums.length==0) return 0;
            int res=-200;
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum+=nums[i];
                if(res<sum) res=sum;
                if(sum<0) sum=0;
            }
            return res;
        }
    }
}
