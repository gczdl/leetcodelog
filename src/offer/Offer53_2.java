package offer;

public class Offer53_2 {

    public static void main(String[] args) {
        Offer53_2.Solution solution = new Offer53_2().new Solution();
        int i = solution.missingNumber(new int[]{0, 1, 3});
        System.out.println(2);
    }

    class Solution {
        public int missingNumber(int[] nums) {
            int l=0,r=nums.length-1;
            while (r>=l){
                int mid=(l+r)/2;
                if(nums[mid]>mid) r=mid-1;
                if(nums[mid]==mid) l=mid+1;
            }
            return l;
        }
    }
}
