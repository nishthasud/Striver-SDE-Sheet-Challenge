class Solution {
    public int minPathSum(int[][] grid) {
      int m=grid.length;
      int n=grid[0].length;
      
      int dp[][]=new int[m][n];
      for(int i=0;i<m;i++)
      {
        for(int j=0;j<n;j++)
        {
          dp[i][j]=-1;
        }
      }
      
      int ans=helper(grid,m-1,n-1,dp);
      return ans;
        
    }
  
  int helper(int[][] grid,int i, int j,int dp[][])
  {
    if((i==0)&&(j==0))
      return grid[i][j];
    if((i<0)||(j<0))
      return Integer.MAX_VALUE;
    if(dp[i][j]!=-1)
      return dp[i][j];
    
    int up=helper(grid,i-1,j,dp);
     int down=helper(grid,i,j-1,dp);
    dp[i][j]=Math.min(up,down)+grid[i][j];
    return dp[i][j];
  }
}