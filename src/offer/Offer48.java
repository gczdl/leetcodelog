package offer;

import java.util.HashMap;
import java.util.HashSet;

public class Offer48 {

    public static void main(String[] args) {
        Offer48.Solution solution = new Offer48().new Solution();
        int ans = solution.lengthOfLongestSubstring("abcabcbb");
        System.out.println(ans);
    }

    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int l=0,r=0;
            int res=0;
            HashMap<Character,Integer> map=new HashMap<>();
            for(r=0;r<s.length();r++){
                char c = s.charAt(r);
                Integer pos = map.get(c);
                if(null!=pos){
                    l=Math.max(pos+1,l);
                }
                map.put(c,r);
                res=Math.max(r-l+1,res);
            }
            return res;
        }
    }
}
