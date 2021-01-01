package offer;

import java.security.spec.RSAOtherPrimeInfo;

public class Offer64 {
    public static void main(String[] args) {
        Offer64.Solution solution = new Offer64().new Solution();
        int fun = solution.sumNums(10);
        System.out.println(fun);
    }

    class Solution {
        public int sumNums(int n) {
            boolean b=n>1&&((n=n+sumNums(n-1))>0);
            return n;
        }
    }

}
