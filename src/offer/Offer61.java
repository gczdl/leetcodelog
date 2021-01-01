package offer;

import java.util.HashSet;
import java.util.Set;

public class Offer61 {
    public static void main(String[] args) {

    }

    class Solution {
        public boolean isStraight(int[] nums) {
            int max=0,min=14;
            Set<Integer> set = new HashSet<>();
            for(int i:nums){
                if(i==0) continue;
                max=Math.max(max,i);
                min=Math.min(min,i);
                if(set.contains(i)) return false;
                set.add(i);
            }
            return max-min<5?true:false;
        }
    }
}
