class Solution {
    public int[][] updateMatrix(int[][] mat) {
      
      int r=mat.length;
      int c=mat[0].length;
      
      int dis[][]=new int[r][c];
      int vis[][]=new int[r][c];
      
      Queue<triplet> q=new LinkedList<>();
      
      for(int i=0;i<r;i++)
      {
        for(int j=0;j<c;j++)
        {
          if(mat[i][j]==0)
          {
            q.add(new triplet(i,j,0));
            vis[i][j]=1;
            
            
          }
          
          else
            vis[i][j]=0;
          
        }
      }
      
      while(!q.isEmpty())
      {
        triplet temp=q.poll();
        dis[temp.x][temp.y]=temp.dist;
        
        int delRow[]={-1,0,1,0};
        int delCol[]={0,1,0,-1};
        
        for(int i=0;i<4;i++)
        {
          int nr=temp.x+delRow[i];
          int nc=temp.y+delCol[i];
          if((nr>=0)&&(nr<r)&&(nc>=0)&&(nc<c)&&(vis[nr][nc]==0))
             {
               vis[nr][nc]=1;
               dis[nr][nc]=temp.dist;
               q.add(new triplet(nr,nc,temp.dist+1));
               
             }
          
        }
        
      }
      
      return dis;
        
    }
}

class triplet
{
  int x;int y;int dist;
  triplet(int x,int y,int dist)
  {
    this.x=x;
    this.y=y;
    this.dist=dist;
    
  }
  
}