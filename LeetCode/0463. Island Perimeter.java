class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[i].length; j++) {
                if(grid[i][j] == 1) {
                    int neighbors = numberOfNeighbors(grid, i, j);
                    perimeter += (4-neighbors);
                }
            }
        }
        return perimeter;
    }
    int numberOfNeighbors(int[][] grid, int i, int j) {
        int neighbors = 0;
        if(i>0 && grid[i-1][j] == 1) neighbors++;
        if(i<grid.length-1 && grid[i+1][j] == 1) neighbors++;
        if(j>0 && grid[i][j-1] == 1) neighbors++;
        if(j<grid[0].length-1 && grid[i][j+1] == 1) neighbors++;
        return neighbors;
    }
}
