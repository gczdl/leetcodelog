package offer;

public class Offer39 {
    public static void main(String[] args) {
        Offer39.Solution solution = new Offer39().new Solution();
        int i = solution.majorityElement(new int[]{1, 2, 3, 2, 2, 2, 2, 5, 4, 2});
        System.out.println(i);
    }

    class Solution {
        public int majorityElement(int[] nums) {
            int ans=nums[0];
            int votes=1;
            for(int i=1;i<nums.length;i++){
                if(votes==0){
                    ans=nums[i];
                    votes++;
                    continue;
                }
                if(ans==nums[i]){
                    votes++;
                }else {
                    votes--;
                }
            }
            return ans;
        }
    }
}
