package offer;

public class Offer58_2 {

    class Solution {
        public String reverseLeftWords(String s, int n) {
            return new StringBuilder(s.substring(n,s.length())).append(s.substring(0,n)).toString();
        }
    }
}
