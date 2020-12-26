package offer;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Offer50 {
    public static void main(String[] args) {
        Offer50.Solution solution = new Offer50().new Solution();

    }

    class Solution {
        public char firstUniqChar(String s) {
            HashMap<Character,Boolean> map = new LinkedHashMap<>();
            char[] chars= s.toCharArray();
            for(char c:chars){
                map.put(c,!map.containsKey(c));
            }
            for(Map.Entry<Character,Boolean> entry:map.entrySet()){
                if(entry.getValue()) return entry.getKey();
            }
            return ' ';
        }
    }
}
