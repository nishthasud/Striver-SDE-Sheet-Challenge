class Solution {
    public int orangesRotting(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int vis[][]=new int[r][c];
      
        for(int i=0;i<r;i++)
        {
          for(int j=0;j<c;j++)
          {
            vis[i][j]=0;
            
          }
        }
      
       int cntRotten=0;int cntFresh=0;
       Queue<triplet> q=new LinkedList<>();
      
      for(int i=0;i<r;i++)
      {
        for(int j=0;j<c;j++)
        {
          if(grid[i][j]==2 && vis[i][j]==0)
          {
            q.add(new triplet(i,j,0));
            cntRotten++;
            vis[i][j]=1;
          }
          
          else if(grid[i][j]==1)
            cntFresh++;
            
          
        }
      }
      
      int ans=0;int fin=0;
      while(!q.isEmpty())
      {
        triplet temp=q.poll();
        fin++;
        ans=Math.max(ans,temp.t);
        
        int delRow[]={-1,0,1,0};
        int delCol[]={0,1,0,-1};
        for(int i=0;i<4;i++)
        {
          int nr=temp.x+delRow[i];
          int nc=temp.y+delCol[i];
          if((nr>=0)&& (nr<r)&&(nc>=0)&& (nc<c)&& (grid[nr][nc]==1) && vis[nr][nc]==0)
          {
            vis[nr][nc]=1;
            q.add(new triplet(nr,nc,temp.t+1));
            
            
          }
          
        }
      }
      
      
      if(fin==cntFresh+cntRotten)
        return ans;
      else
        return -1;
      
      
    }
  
  class triplet
  {
    int x;int y;int t;
    triplet(int x,int y,int t)
    {
      this.x=x;
      this.y=y;
      this.t=t;
    }
    
  }
}