class Solution {
    public void solve(char[][] board) {
      int r=board.length;
      int c=board[0].length;
      
      int[][] vis=new int[r][c];
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
        if(board[0][i]=='O' && vis[0][i]==0)
          dfs(0,i,r,c,board,vis);
        
      }
      
      //last row
       for(int i=0;i<c;i++)
      {
        if(board[r-1][i]=='O' && vis[r-1][i]==0)
          dfs(r-1,i,r,c,board,vis);
        
      }
      
      
      //first col
      
       for(int i=0;i<r;i++)
      {
        if(board[i][0]=='O' && vis[i][0]==0)
          dfs(i,0,r,c,board,vis);
        
      }
      
      
      //last col
       for(int i=0;i<r;i++)
      {
        if(board[i][c-1]=='O' && vis[i][c-1]==0)
          dfs(i,c-1,r,c,board,vis);
        
      }
      
      for(int i=0;i<r;i++)
      {
        for(int j=0;j<c;j++)
        {
          
          if(board[i][j]=='O' && vis[i][j]==0)
            board[i][j]='X';
        }
      }
        
    }
  
  void dfs(int cr,int cc,int r,int c,char[][] board,int[][] vis)
  {
    
    
    vis[cr][cc]=1;
    int delRow[]={-1,0,1,0};
    int delCol[]={0,1,0,-1};
    
    for(int k=0;k<4;k++)
    {
      //System.out.println("%%%%");
      int nr=cr+delRow[k];
      int nc=cc+delCol[k];
      if((nr>=0) && (nr<r) && (nc>=0) && (nc<c) && (vis[nr][nc]==0) && (board[nr][nc]=='O'))
      {
       
        vis[nr][nc]=1;
        dfs(nr,nc,r,c,board,vis);
      }
      
    }
    
  }
}