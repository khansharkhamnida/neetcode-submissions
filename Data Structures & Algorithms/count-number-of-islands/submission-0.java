class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == '1'){
                    count++;
                    findIsland(i, j, grid);
                }
            }
        }
        return count;
    }

    private void findIsland(int i, int j, char[][] grid){
        if(i<0 || i>= grid.length || j<0 || j>= grid[0].length || grid[i][j] == '0') return;

        grid[i][j] = '0';
        findIsland(i-1, j, grid);
        findIsland(i+1, j, grid);
        findIsland(i, j+1, grid);
        findIsland(i, j-1, grid);
    }
}
