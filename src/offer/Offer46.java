package offer;


public class Offer46 {
    public static void main(String[] args) {
        Offer46.Solution solution= new Offer46().new Solution();
        int i = solution.translateNum(506);
        System.out.println(i);
    }

    class Solution {
        public int translateNum(int num) {
            String numStr = String.valueOf(num);
            if(numStr.length()==1) return 1;
            int l=1,j=1,r=0;
            for(int i=2;i<=numStr.length();i++){
                r=j+l*(new Integer(numStr.substring(i-2,i))<=25&&numStr.charAt(i-2)!='0'?1:0);
                l=j;
                j=r;
            }
            return r;
        }
    }
}
