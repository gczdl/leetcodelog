package offer;

public class Offer53_1 {

    public static void main(String[] args) {
        Offer53_1.Solution solution=new Offer53_1().new Solution();
        int search = solution.search(new int[]{5, 7, 7, 8,8, 10}, 8);
        System.out.println(search);
    }

    class Solution {
        public int search(int[] nums, int target) {
            int left=0,right=nums.length-1;
            if(right==-1) return 0;
            while (right>=left){
                int mid=(left+right)/2;
                if(nums[mid]>=target) right=mid-1;
                if(nums[mid]<target) left=mid+1;
            }
            int l=right;
            if(l==nums.length-1&&nums[nums.length-1]==target) return 1;
            left=0;right=nums.length-1;
            while (right>=left){
                int mid=(left+right)/2;
                if(nums[mid]>target) right=mid-1;
                if(nums[mid]<=target) left=mid+1;
            }
            int r=left;
            if(r==0&&nums[0]==target) return 1;
            return r-l-1;
        }
    }
}
