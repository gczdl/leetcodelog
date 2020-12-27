package offer;

public class Offer55_1 {
    public static void main(String[] args) {
        TreeNode tree = Utils.buildTree(new int[]{3, 9, 20, -1, -1, 15, 7});
        Offer55_1.Solution solution = new Offer55_1().new Solution();
        int d = solution.maxDepth(tree);
        System.out.println(d);
    }
    class Solution {
        int d=0;
        public int maxDepth(TreeNode root) {
            if(root!=null) dfs(root,1);
            return d;
        }

        public void dfs(TreeNode node,int k){
            d=Math.max(d,k);
            if(node.left!=null) dfs(node.left,k+1);
            if(node.right!=null) dfs(node.right,k+1);
        }
    }
}

