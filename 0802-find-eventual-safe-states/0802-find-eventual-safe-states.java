class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
      
     List<List<Integer>> adj=new ArrayList<>();
      List<List<Integer>> adjRev=new ArrayList<>();
      int inDegree[]=new int[graph.length];
      Arrays.fill(inDegree,0);
      List<Integer> ans=new ArrayList<Integer>();
      
      for(int i=0;i<graph.length;i++)
      {
        adj.add(new ArrayList<>());
        
      }
      for(int i=0;i<graph.length;i++)
      {
        adjRev.add(new ArrayList<>());
        
      }
        
        
      for(int i=0;i<graph.length;i++)
      {
        for(int j=0;j<graph[i].length;j++)
        {
          adj.get(i).add(graph[i][j]);
          
        }
        
      }
    //  System.out.println(adj);
      
      for(int i=0;i<graph.length;i++)
      {
        for(int it:adj.get(i))
        {
          adjRev.get(it).add(i);
          inDegree[i]++;
          
        }
        
      }
      Queue<Integer> q=new LinkedList<>();
      for(int i=0;i<inDegree.length;i++)
      {
        if(inDegree[i]==0)
          q.add(i);
      }
      
      while(!q.isEmpty())
      {
        int temp=q.poll();
        ans.add(temp);
        for(int it:adjRev.get(temp))
        {
          inDegree[it]--;
          if(inDegree[it]==0)
          {
            q.add(it);
            
          }
          
        }
        
      }
      
      Collections.sort(ans);
      return ans;
      
    }
}