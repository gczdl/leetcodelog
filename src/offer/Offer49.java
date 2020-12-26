package offer;

public class Offer49 {
    public static void main(String[] args) {
        Offer49.Solution solution = new Offer49().new Solution();
        int ans = solution.nthUglyNumber(10);
        System.out.println(ans);
    }

    class Solution {
        public int nthUglyNumber(int n) {
            int a=0,b=0,c=0;
            int[] dp=new int[n];
            dp[0]=1;
            for(int i=1;i<n;i++){
                int n1=dp[a]*2,n2=dp[b]*3,n3=dp[c]*5;
                //上一个数是三个数中最小的，而且索引位置会加一，所以下一次三个数必然都会大于上一个丑数
                dp[i]=Math.min(n3,Math.min(n1,n2));
                if(dp[i]==n1) a++;
                if(dp[i]==n2) b++;
                if(dp[i]==n3) c++;
            }
            return dp[n-1];
        }
    }
}
