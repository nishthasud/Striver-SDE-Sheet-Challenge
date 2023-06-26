class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
      int r=image.length;
      int c=image[0].length;
      int vis[][]=new int[r][c];
      for(int i=0;i<r;i++)
      {
        for(int j=0;j<c;j++)
        {
          vis[i][j]=0;
        }
      }
      
      Queue<int[]> q=new LinkedList<>();
      int s_color=image[sr][sc];
      q.add(new int[]{sr,sc});
      vis[sr][sc]=1;
      image[sr][sc]=color;
      
      while(!q.isEmpty())
      {
        int temp[]=q.poll();
        int delRow[]={-1,0,1,0};
        int delCol[]={0,1,0,-1};
        for(int i=0;i<4;i++)
        {
          int nr=temp[0]+delRow[i];
          int nc=temp[1]+delCol[i];
          
          if((nr>=0)&&(nr<r)&&(nc>=0)&&(nc<c)&& (vis[nr][nc]==0)&&(image[nr][nc]==s_color))
             {
               image[nr][nc]=color;
               vis[nr][nc]=1;
               q.add(new int[]{nr,nc});
               
             }
          
        }
        
      }
             
             return image;
      
    }
}