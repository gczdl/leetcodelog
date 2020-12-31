package offer;

public class Offer60 {
    public static void main(String[] args) {

        Offer60.Solution solution = new Offer60().new Solution();
        double[] doubles = solution.dicesProbability(2);
        for(double d:doubles){
            System.out.println(d+" ");
        }

    }

    class Solution {

        double[][] dp;

        public double[] dicesProbability(int n) {
            dp=new double[n+1][n*6+1];
            dp[0][0]=1;
            for(int i=1;i<=6;i++){
                dp[1][i]=1f/6f;
            }
            for(int i=1;i<=n;i++){
                for(int j=i;j<=i*6;j++){
                    dp[i][j]=fun(i,j);
                }
            }
            double[] res = new double[n*6-n+1];
            for(int i=0,j=n;j<=n*6;j++,i++){
                res[i]=dp[n][j];
            }
            return res;
        }

        private double fun(int i,int j){
            double res=0;
            for(int k=j-1;k>=j-6&&k>=0;k--){
                res+=dp[i-1][k]*(1f/6f);
            }
            return res;
        }
    }


}
