package offer;

public class Utils {

    //根据数组生成二叉搜索数
    public static TreeNode arrayToTreeNode(int[] list){
        if(list.length==0) return null;
        TreeNode head=new TreeNode(list[0]);
        for(int i=1;i<list.length;i++){
            addTreeNode(head,list[i]);
        }
        return head;
    }

    private static void addTreeNode(TreeNode node,int a){
        if(a>=node.val){
            if(node.right==null) node.right=new TreeNode(a);
            else addTreeNode(node.right,a);
        }else {
            if(node.left==null) node.left=new TreeNode(a);
            else addTreeNode(node.left,a);
        }

    }

    //根据二叉树节点序号保存的数组还原为TreeNode的节点的二叉树
    public static TreeNode buildTree(int[] list){
        if(list==null||list.length==0) return null;
        TreeNode head = buildSubTree(list, 0);
        return head;
    }

    private static TreeNode buildSubTree(int[] list,int index){
        if(list[index]==-1) return null;
        TreeNode head=new TreeNode(list[index]);
        int r = list.length-1;
        if(index*2+2<=r){
            head.right=buildSubTree(list,index*2+2);
        }
        if(index*2+1<r){
            head.left=buildSubTree(list,index*2+1);
        }
        return head;
    }
}
