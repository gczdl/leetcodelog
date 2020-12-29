package offer;

import java.util.ArrayList;
import java.util.List;

public class Offer57_2 {
    public static void main(String[] args) {
        Offer57_2.Solution solution = new Offer57_2().new Solution();
        int[][] continuousSequence = solution.findContinuousSequence(9);
        for(int[] list:continuousSequence){
            for(int i:list){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    class Solution {
        public int[][] findContinuousSequence(int target) {
            int l=1,r=2;
            int sum=l+r;
            List<int[]> list=new ArrayList<>();
            while (l<=target/2){
                if(sum==target){
                    int[] temp=new int[r-l+1];
                    for(int i=l;i<=r;i++){
                        temp[i-l]=i;
                    }
                    list.add(temp);
                    sum-=l++;
                }else if(sum<target){
                    sum+=++r;
                }else{
                    sum-=l++;
                }
            }
            return list.toArray(new int[list.size()][]);
        }
    }
}
