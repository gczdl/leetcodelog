package offer;

public class Utils {
    public static TreeNode arrayToTreeNode(int[] list){
        if(list.length==0) return null;
        TreeNode head=new TreeNode(list[0]);
        for(int i=1;i<list.length;i++){
            addTreeNode(head,list[i]);
        }
        return head;
    }

    public static void addTreeNode(TreeNode node,int a){
        if(a>=node.val){
            if(node.right==null) node.right=new TreeNode(a);
            else addTreeNode(node.right,a);
        }else {
            if(node.left==null) node.left=new TreeNode(a);
            else addTreeNode(node.left,a);
        }

    }

}
