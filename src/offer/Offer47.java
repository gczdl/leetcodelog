package offer;

import java.util.LinkedList;
import java.util.Queue;

public class Offer47 {
    public static void main(String[] args) {
        Offer47.Solution solution = new Offer47().new Solution();
        int ans = solution.maxValue(new int[][]{
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        });
        System.out.println(ans);
    }

    class Solution {
        public int maxValue(int[][] grid) {
            int row=grid.length,col=grid[0].length;
            int[][] value=new int[row][col];
            bfs(grid,value);
            return value[row-1][col-1];
        }

        private void bfs(int[][] grid,int[][] value){
            int row=grid.length,col=grid[0].length;
            Queue<int[]> queue=new LinkedList<>();
            queue.add(new int[]{0,0});
            value[0][0]=grid[0][0];
            while (!queue.isEmpty()){
                int[] pos = queue.poll();
                int x=pos[0],y=pos[1];
                int xx=x+1;
                if(xx<row&&value[xx][y]<value[x][y]+grid[xx][y]){
                    value[xx][y]=value[x][y]+grid[xx][y];
                    queue.add(new int[]{xx,y});
                }
                int yy=y+1;
                if(yy<col&&value[x][yy]<value[x][y]+grid[x][yy]){
                    value[x][yy]=value[x][y]+grid[x][yy];
                    queue.add(new int[]{x,yy});
                }
            }
        }
    }
}
