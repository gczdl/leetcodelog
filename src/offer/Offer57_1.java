package offer;

public class Offer57_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int l=0,r=nums.length-1;

            while (r>=l){
                int mid=(r+l)/2;
                if(nums[mid]>target) r=mid-1;
                if(nums[mid]<=target) l=mid+1;
            }
            r=l-1;
            l=0;
            while (r>l){
                int sum=nums[l]+nums[r];
                if(sum==target) return new int[]{nums[l],nums[r]};
                if(sum<target) l++;
                if(sum>target) r--;
            }
            return new int[0];
        }
    }
}
