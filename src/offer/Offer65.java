package offer;

public class Offer65 {
    public static void main(String[] args) {
        Offer65.Solution solution = new Offer65().new Solution();
        int add = solution.add(3, 2);
        System.out.println(add);
    }

    class Solution {
        public int add(int a, int b) {
            int c=(a&b)<<1;//进位和
            int d=a^b;//不进位和
            while (c!=0){//当进位不为0
                int temp=(d&c)<<1;//临时进位和
                d^=c;//不进位和
                c=temp;
            }
            return d;
        }
    }
}
