package offer;

public class Offer63 {
    public static void main(String[] args) {
        Offer63.Solution solution = new Offer63().new Solution();
        int i = solution.maxProfit(new int[]{1, 2});
        System.out.println(i);
    }

//    class Solution {
//        public int maxProfit(int[] prices) {
//            if(prices.length==0) return 0;
//            int min=Integer.MAX_VALUE,max=0;
//            int res=0;
//            for(int i=0;i<prices.length-1;i++){
//                if(prices[i]>=min) continue;
//                min=prices[i];
//                for(int j=i+1;j<prices.length;j++){
//                    max=prices[j];
//                    res=Math.max(res,max-min);
//                }
//            }
//            return res;
//        }
//    }

    class Solution {
        public int maxProfit(int[] prices) {
            if(prices.length==0) return 0;
            int minIndex=0;
            int res=0;
            for(int i=1;i<prices.length;i++){
                res=Math.max(res,prices[i]-prices[minIndex]);
                if(prices[i]<prices[minIndex]){
                    minIndex=i;
                }
            }
            return res;
        }
    }
}
