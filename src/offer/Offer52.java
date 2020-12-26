package offer;

public class Offer52 {
    public static void main(String[] args) {
        Offer52.Solution solution=new Offer52().new Solution();
        solution.getIntersectionNode(null,null);
    }
     public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
             val = x;
             next = null;
         }
     }

    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode a=headA,b=headB;
            while (a!=b){
                if(a==null) {
                    a=headB;
                }else {
                    a=a.next;
                }
                if(b==null) {
                    b=headA;
                }else {
                    b=b.next;
                }
            }
            return a;
        }
    }
}
