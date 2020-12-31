package offer;

public class Offer58_1 {
    public static void main(String[] args) {
        Offer58_1.Solution solution = new Offer58_1().new Solution();
        String s = solution.reverseWords("a good example");
        System.out.println(s);
    }

//    class Solution {
//        public String reverseWords(String s) {
//            if(s.trim().length()==0) return "";
//            StringBuilder res=new StringBuilder();
//            int r=s.length(),l;
//            while (--r>=0){
//                if(s.charAt(r)==' ') continue;
//                l=r;
//                while (--l>=0){
//                    if(s.charAt(l)==' ') {
//                        res.append(s.substring(l+1,r+1)+" ");
//                        r=l;
//                        break;
//                    }
//                }
//                if(l==-1) {
//                    res.append(s.substring(0,r+1)+" ");
//                    r=l;
//                }
//            }
//            return res.toString().trim();
//        }
//    }
class Solution {
    public String reverseWords(String s) {
        String str = s.trim();
        int r=str.length()-1;
        int l=r;
        StringBuilder res=new StringBuilder();
        while (l>=0){
            while (l>=0&&str.charAt(l)!=' ') l--;
            res.append(str.substring(l+1,r+1)+" ");
            while (l>=0&&str.charAt(l)==' ') l--;
            r=l;
        }
        return res.toString().trim();
    }
}
}
