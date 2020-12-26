package offer;

import java.util.Arrays;

public class Offer45 {
    public static void main(String[] args) {
        Offer45.Solution solution=new Offer45().new Solution();
        String s = solution.minNumber(new int[]{1,2,3,1});
        System.out.println(s);
    }

    class Solution {
        public String minNumber(int[] nums) {

            String[] strs = new String[nums.length];
            for(int i = 0; i < nums.length; i++)
                strs[i] = String.valueOf(nums[i]);
            partition(strs,0,nums.length-1);
            StringBuilder stringBuilder=new StringBuilder();
            for(int i=0;i<strs.length;i++){
                stringBuilder.append(strs[i]);
            }
            return stringBuilder.toString();
        }

//        private void quickSort(int[] nums,int start,int end){
//            if(start>=end) return;
//            int mid=partition(nums,start,end);
//            quickSort(nums,start,mid-1);
//            quickSort(nums,mid+1,end);
//        }

        private void partition(String[] nums,int start,int end){
            if(start>=end) return;
            String  base=nums[start];
            int l=start,r=end+1;
            while (true){
                while (--r>l&&((nums[r]+base).compareTo(base+nums[r])>0));
                while (++l<r&&((nums[l]+base).compareTo(base+nums[l])<0));
                if(l>=r) break;
                String temp=nums[r];
                nums[r]=nums[l];
                nums[l]=temp;
            }
            nums[start]=nums[r];
            nums[r]=base;
            partition(nums,start,r-1);
            partition(nums,r+1,end);
        }
    }
}
