package offer;



public class Offer54 {

    public static void main(String[] args) {
        Offer54.Solution solution = new Offer54().new Solution();

    }
//    Definition for a binary tree node.
//    public class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//        TreeNode(int x) { val = x; }
//    }

    class Solution {
        int res,k;
        public int kthLargest(TreeNode root, int k) {
            this.k=k;
            dfs(root);
            return res;
        }

        private void dfs(TreeNode node){
            if(node==null) return;
            dfs(node.right);
            if(--k==0) {
                res=node.val;
                return;
            }
            dfs(node.left);
        }
    }
}
