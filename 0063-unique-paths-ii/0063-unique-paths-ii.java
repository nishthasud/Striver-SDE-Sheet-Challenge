class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
      int m=obstacleGrid.length;
      int n=obstacleGrid[0].length;
    //  System.out.println(m);
    //   System.out.println(n);
      
     int dp[][]=new int[m][n];
      for(int a=0;a<m;a++)
      {
        for(int b=0;b<n;b++)
        {
          dp[a][b]=-1;
        }
      }
      
    //  dp[0][0]=1;
      int ans=f(m,n,m-1,n-1,dp,obstacleGrid);
      return ans;
        
    }
        
    
  
 int f(int m,int n, int i,int j,int dp[][],int[][] obstacleGrid)
  {
   if(i>=0 && j>=0 && obstacleGrid[i][j]==1)
     return 0;
    if(i==0&& j==0)
      
        return 1;
    
    //  return dp[i][j];
      if(i<0  || j<0)
        return 0;
    if(dp[i][j]!=-1)
      return dp[i][j];
  // if(i>=0 && j>=0 && obstacleGrid[i][j]==1)
   //  return 0;
      int ls=f(m,n,i-1,j,dp,obstacleGrid);
    int rs=f(m,n,i,j-1,dp,obstacleGrid);
    dp[i][j]= ls+rs;
    return dp[i][j];
    
  }
        
}