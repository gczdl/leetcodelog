package offer;

public class Offer56_1 {

    public static void main(String[] args) {

    }

    class Solution {
        public int[] singleNumbers(int[] nums) {
            int ans=0;
            for(int i:nums){
                ans^=i;
            }
            int index=1;
            while ((ans&index)==0){
                index<<=1;
            }
            int a=0,b=0;
            for(int i:nums){
                if((i&index)==0) a^=i;
                else b^=i;
            }
            return new int[]{a,b};
        }
    }
}
