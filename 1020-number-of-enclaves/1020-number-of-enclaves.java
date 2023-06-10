class Solution {
    public int numEnclaves(int[][] grid) {
      int r=grid.length;
      int c=grid[0].length;
      int ans=0;
      
      int vis[][]=new int[r][c];
      
      for(int i=0;i<r;i++)
      {
        for(int j=0;j<c;j++)
        {
          vis[i][j]=0;
        }
      }
      
      // first row
      for(int i=0;i<c;i++)
      {
        if(grid[0][i]==1 && vis[0][i]==0){
          
          dfs(0,i,r,c,grid,vis);
       //   System.out.println("1st row");
          }
         // dfs(0,i,r,c,grid,vis);
        
      }
      
      //last row
       for(int i=0;i<c;i++)
      {
        if(grid[r-1][i]==1 && vis[r-1][i]==0)
        {
          dfs(r-1,i,r,c,grid,vis);
       //   System.out.println("last row");
        }
        
      }
      
      
      //first col
      
       for(int i=0;i<r;i++)
      {
        if(grid[i][0]==1 && vis[i][0]==0)
        {
          dfs(i,0,r,c,grid,vis);
       //   System.out.println("1st col");
        }
        
      }
      
      
      //last col
       for(int i=0;i<r;i++)
      {
        if(grid[i][c-1]==1 && vis[i][c-1]==0)
        {
          dfs(i,c-1,r,c,grid,vis);
       //   System.out.println("last col");
        }
        
      }
      
      for(int i=0;i<r;i++)
      {
        for(int j=0;j<c;j++)
        {
          if(vis[i][j]==0&& grid[i][j]==1)
            ans++;
          
        }
      }
        return ans;
    }
  
  void dfs(int cr,int cc,int r,int c,int[][] grid,int[][] vis)
  {
    vis[cr][cc]=1;
    // System.out.println("***cr"+cr);
   //  System.out.println("***cc"+cc);
    int delRow[]={-1,0,1,0};
    int delCol[]={0,1,0,-1};
    
    for(int k=0;k<4;k++)
    {
      int nr=cr+delRow[k];
      int nc=cc+delCol[k];
    //  System.out.println("nr"+nr);
    //  System.out.println("nc"+nc);
      if(nr>=0 && nr<r && nc>=0 && nc<c && grid[nr][nc]==1 && vis[nr][nc]==0)
      {
      //  System.out.println("nr"+nr);
     // System.out.println("nc"+nc);
        vis[nr][nc]=1;
        
        System.out.println("***");
        dfs(nr,nc,r,c,grid,vis);
        
      }
      
    }
    
    
  }
}