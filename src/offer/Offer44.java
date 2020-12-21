package offer;


public class Offer44 {
    public static void main(String[] args) {
        Offer44.Solution solution = new Offer44().new Solution();
        int nthDigit = solution.findNthDigit(11);
        System.out.println(nthDigit);
    }
    class Solution {
        public int findNthDigit(int n) {
            int digit = 1;
            long start = 1;
            long count = 9;
            while (n > count) { // 1.
                n -= count;
                digit += 1;
                start *= 10;
                count = digit * start * 9;
            }
            long num = start + (n - 1) / digit; // 2.
            return Long.toString(num).charAt((n - 1) % digit) - '0'; // 3.
        }
    }
}
