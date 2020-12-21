package offer;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Offer40 {

    public static void main(String args[]){
        Offer40.Solution solution = new Offer40().new Solution();
        int[] nums=new int[]{4,5,1,6,2,7,3,8};
        int[] leastNumbers = solution.getLeastNumbers(nums, 4);
        for(int i:leastNumbers){
            System.out.println(i);
        }
    }

    class Solution {
//        //快排
//        public int[] getLeastNumbers(int[] arr, int k) {
//            if(k==0||arr.length==0) return new int[0];
//            return quickSearch(arr,0,arr.length-1,k-1);
//        }
//        private int[] quickSearch(int[] nums,int start,int end,int k){
//            int j=partition(nums,start,end);
//            if(j==k){
//                return Arrays.copyOf(nums,j+1);
//            }
//            return j>k?quickSearch(nums,start,j-1,k):quickSearch(nums,j+1,end,k);
//        }
//        private int partition(int[] nums,int start,int end){
//            int base=nums[start];
//            int l=start,r=end+1;
//            while (l<r){
//                while (--r>=l&&nums[r]>base);
//                while (++l<=r&&nums[l]<base);
//                if(l>=r) break;
//                int t=nums[r];
//                nums[r]=nums[l];
//                nums[l]=t;
//            }
//            nums[start]=nums[r];
//            nums[r]=base;
//            return r;
//        }

        public int[] getLeastNumbers(int[] arr, int k) {
            if(k==0||arr.length==0) return new int[0];

            Queue<Integer> pq=new PriorityQueue<>((v1,v2)->v2-v1);
            for(int num:arr){
                if(pq.size()<k){
                    pq.offer(num);
                }else if (num<pq.peek()){
                    pq.poll();
                    pq.offer(num);
                }
            }
            int[] res=new int[pq.size()];
            int idx=0;
            for (int num:pq){
                res[idx++]=num;
            }
            return res;
        }
    }
}
