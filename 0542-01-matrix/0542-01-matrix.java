class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
      
       int ans[][]=new int[r][c];
       int vis[][]=new int[r][c];
      
       for(int i=0;i<r;i++)
       {
         for(int j=0;j<c;j++)
         {
           vis[i][j]=0;
           
         }
       }
      
      Queue<int[]> q=new LinkedList<>();
      
      for(int i=0;i<r;i++)
      {
        for(int j=0;j<c;j++)
        {
          if(vis[i][j]==0 && mat[i][j]==0)
          {
            q.add(new int[]{i,j,0});
            vis[i][j]=1;
            ans[i][j]=0;
            
          }
          
        }
      }
      
      while(!q.isEmpty())
      {
        int[] temp=q.poll();
        int delRow[]={-1,0,1,0};
        int delCol[]={0,1,0,-1};
        for(int i=0;i<4;i++)
        {
          int nr=temp[0]+delRow[i];
          int nc=temp[1]+delCol[i];
          if((nr>=0) &&(nr<r)&& (nc>=0)&& (nc<c)&& vis[nr][nc]==0)
          {
            vis[nr][nc]=1;
            ans[nr][nc]=temp[2]+1;
            q.add(new int[]{nr,nc,temp[2]+1});
          }
        }
        
      }
      
      return ans;
    }
}