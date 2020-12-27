package offer;

public class Offer55_2 {

    public static void main(String[] args) {
        Offer55_2.Solution solution = new Offer55_2().new Solution();
        TreeNode tree = Utils.buildTree(new int[]{1,2,2,3,3,-1,-1,4,4});
        boolean balanced = solution.isBalanced(tree);
        System.out.println(balanced);
    }

    class Solution {
        public boolean isBalanced(TreeNode root) {
            if(root==null) return true;
            int dfs = dfs(root);
            if(dfs==-1) return false;
            return true;
        }
        //检查左右子树高度是否符合，不符合直接结束，符合就返回较高的深度
        private int dfs(TreeNode root){
            //深度度为0
            if(root==null) return 0;

            int leftD=dfs(root.left);
            //如果左子树不平衡，直接返回不符合
            if(leftD==-1) return -1;

            int rightD=dfs(root.right);
            ////如果右子树不平衡，直接返回不符合
            if(rightD==-1) return -1;
            //看当前树符不符合，不符合返回-1
            if(Math.abs(leftD-rightD)>1) return -1;
            //符合就返回当前树深度
            return Math.max(leftD,rightD)+1;
        }
    }

}
