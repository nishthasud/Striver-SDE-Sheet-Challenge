class Solution {
    public int orangesRotting(int[][] grid) {
      
      int r=grid.length;
      int c=grid[0].length;
      
      Queue<triplet> q=new LinkedList<>();
      int ans=0,cntfresh=0;int cnt=0;
      
      int vis[][]=new int[r][c];
      for(int i=0;i<r;i++)
      {
        for(int j=0;j<c;j++)
          
        {
          
          if(grid[i][j]==2)
          {
            vis[i][j]=2;
            q.add(new triplet(i,j,0));
          }
          
          else
            vis[i][j]=0;
          
          if(grid[i][j]==1)
            cntfresh++;
          
          
        }
      }
      
      while(q.isEmpty()==false)
      {
        triplet t=q.poll();
        int cr=t.x;
        int cc=t.y;
        int ct=t.t;
        ans=Math.max(ans,ct);
        int[] delRow={-1,0,1,0};
        int[] delCol={0,1,0,-1};
        for(int i=0;i<4;i++)
        {
         // System.out.println("*****");
          int nr=cr+delRow[i];
          int nc=cc+delCol[i];
          if((nr>=0)&&(nr<r)&&(nc>=0)&&(nc<c)&&(vis[nr][nc]!=2)&&(grid[nr][nc]==1))
          {
            vis[nr][nc]=2;
            cnt++;
            grid[nr][nc]=2;
         //   System.out.println("*****"+ct);
            q.add(new triplet(nr,nc,ct+1));
            
          }
          
        }
        
      }
      //System.out.println("&&&&"+cnt);
      
      if(cnt!=cntfresh)
        return -1;
      else
        return ans;
      
    }
}

class triplet
{
  int x;
  int y;int t;
  triplet(int x,int y,int t)
  {
    this.x=x;
    this.y=y;
    this.t=t;
    
  }
  
}