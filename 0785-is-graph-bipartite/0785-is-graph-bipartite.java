class Solution {
    public boolean isBipartite(int[][] graph) {
      
      int vis[]=new int [graph.length];
      for(int i=0;i<graph.length;i++)
        vis[i]=-1;
      boolean ans=true;
      for(int i=0;i<graph.length;i++)
      {
        if(vis[i]==-1)
        {
           boolean a=bfs(i,graph,vis);
          ans=ans&&a;
        }
      }
     
      return ans;
        
        
    }
  
  boolean bfs(int k,int[][] graph,int[] vis)
  {
    Queue<Pair> q=new LinkedList<>();
    q.add(new Pair(k,0));
    vis[k]=0;  
    while(!q.isEmpty())
    {
      Pair p=q.poll();
      
      int[] temp=graph[p.v];
      
      for(int i=0;i<temp.length;i++)
      {
        if(vis[temp[i]]==p.color)
          return false;
        else if(vis[temp[i]]==-1)
        {
          int col=p.color==1?0:1;
          q.add(new Pair(temp[i],col));
          vis[temp[i]]=col;
          
        }
          
        
      }
      
      
    }
    return true;
    
  }
  
}

class Pair
{
  int v;int color;
  
  Pair(int v,int color)
  {
    this.v=v;
    this.color=color;
    
  }
  
}