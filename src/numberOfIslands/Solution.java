package numberOfIslands;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[][] tester ={
                {"1","1","1","1","0"},
        {"1","1","0","1","0"},
            {"1","1","0","0","0"},
                {"0","0","0","0","0"}
        };
        System.out.println(sol.numIslands(tester));
    }
    public int numIslands(String[][] grid) {
        int count =0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j]=="1"){
                    count++;
                    checkSearchOnes(grid, i , j);
                }
            }
        }
        return count;
    }

    public void checkSearchOnes(String[][]grid, int i, int j){
        if(i<0|| i>= grid.length || j<0|| j>=grid[i].length || grid[i][j] == "0"){
            return;
        }

        grid[i][j]="0";
        checkSearchOnes(grid, i-1, j);
        checkSearchOnes(grid, i+1, j);
        checkSearchOnes(grid, i, j-1);
        checkSearchOnes(grid, i, j+1);
    }
}
