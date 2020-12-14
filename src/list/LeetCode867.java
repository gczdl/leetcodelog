package list;
/**
 * 给定一个矩阵 A， 返回 A 的转置矩阵。
 *
 *         矩阵的转置是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
 *
 *
 *
 *         示例 1：
 *
 *         输入：[[1,2,3],[4,5,6],[7,8,9]]
 *         输出：[[1,4,7],[2,5,8],[3,6,9]]
 *         示例 2：
 *
 *         输入：[[1,2,3],[4,5,6]]
 *         输出：[[1,4],[2,5],[3,6]]
 *          
 *
 *         提示：
 *
 *         1 <= A.length <= 1000
 *         1 <= A[0].length <= 1000
 *
 *         来源：力扣（LeetCode）
 *         链接：https://leetcode-cn.com/problems/transpose-matrix
 *         著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class LeetCode867 {
    public static void main(String[] args) {
        LeetCode867 util=new LeetCode867();
        int[][] A=new int[][]{
                {1,2,3},{4,5,6},{7,8,9}
        };
        int[][] transpose = util.transpose(A);
        for(int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[0].length;j++){
                System.out.printf(" %s ",transpose[i][j]);
            }
            System.out.println();
        }
    }
    public int[][] transpose(int[][] A) {
        int row=A.length,colow=A[0].length;
        int[][] B=new int[colow][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<colow;j++){
                B[j][i]=A[i][j];
            }
        }
        return B;
    }
}