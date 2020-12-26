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
                //需要注意的是如果digit和start都是int类型可能会发生溢出
                //因为表达式最大类型是int，那结果就会先用int类型保存，再赋值给count
                //这里start是long类型，结果会用long类型保存再赋值给count
                count = digit * start * 9;
            }
            long num = start + (n - 1) / digit; // 2.
            return Long.toString(num).charAt((n - 1) % digit) - '0'; // 3.
        }
    }
}
