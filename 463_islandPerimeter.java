public class Solution {
  public int islandPerimeter(int[][] grid) {
    int cols = grid[0].length;
    int rows = grid.length;

    int perimeter = 0;
    for (int i = 0; i < rows; ++i){
      for (int j = 0; j < cols; ++j){
        if (grid[i][j] == 1){
          perimeter = perimeter + getPer(grid, rows, cols, i, j);
        }
      }
    }
    return perimeter;
  }

  public int getPer(int[][] grid, int rows, int cols, int i, int j){
    int count = 0;

    //left
    if (i - 1 > -1){
      if (grid[i-1][j] == 0){
        count += 1;
      }
    }else {
      count += 1;
    }
    //right
    if (i + 1 < rows){
      if (grid[i+1][j] == 0){
        count += 1;
      }
    }else {
      count += 1;
    }
    //up
    if (j - 1 > -1){
      if (grid[i][j-1] == 0){
        count += 1;
      }
    }else {
      count += 1;
    }
    //down
    if (j + 1 < cols){
      if (grid[i][j+1] == 0){
        count += 1;
      }
    }else {
      count += 1;
    }

    return count;
  }

}