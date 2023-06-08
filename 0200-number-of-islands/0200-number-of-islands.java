class Solution {
    public int numIslands(char[][] grid) {
      
      int count=0;
      int vis[][]=new int[grid.length][grid[0].length];
    for(int i=0;i<grid.length;i++)
    {
      for(int j=0;j<grid[0].length;j++)
      {
        vis[i][j]=0;
      }
    }
      
      
      for(int i=0;i<grid.length;i++)
      {
        for(int j=0;j<grid[0].length;j++)
        {
          if(grid[i][j]=='1'&& vis[i][j]==0)
          {
            count++;
            dfs(grid,vis,i,j);
            
          }
          
        }
        
      }
      
      return count;
        
    }
  
  void dfs(char[][] grid,int vis[][],int row,int col)
  {
    if((row>=0) && (row<grid.length) && (col>=0) && (col<grid[0].length) && (grid[row][col]=='1') && (vis[row][col]==0))
    {
      vis[row][col]=1;
      
      dfs(grid,vis,row+1,col); // traversing in down direction
      dfs(grid,vis,row-1,col); // traversing in up direction
      dfs(grid,vis,row,col+1); // traversing in right direction
      dfs(grid,vis,row,col-1); // traversing in left direction
      
    }
    
  }
}