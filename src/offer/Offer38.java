package offer;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Offer38 {


    public static void main(String[] args) {
        Solution solution = new Offer38().new Solution();
        String[] strs = solution.permutation("abc");
        for(String str:strs){
            System.out.println(str);
        }
    }

    class Solution {
        List<String> res=new ArrayList<>();
        char[] chars;
        public String[] permutation(String s) {
            chars = s.toCharArray();
            dfs(0);
            return res.toArray(new String[res.size()]);
        }

        public void dfs(int x){
            if(x==chars.length-1){
                res.add(String.valueOf(chars));
                return;
            }
            HashSet<Character> set=new HashSet<>();
            for(int i=x;i<chars.length;i++){
                if(set.contains(chars[i])) continue;
                set.add(chars[i]);
                swap(x,i);
                dfs(x+1);
                swap(x,i);
            }
        }
        private void swap(int a,int b){
            char c=chars[a];
            chars[a]=chars[b];
            chars[b]=c;
        }
    }
}
