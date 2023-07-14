class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
      
      int vis[]=new int[rooms.size()];
      Arrays.fill(vis,0);
      Queue<Integer> q=new LinkedList<>();
      q.add(0);
      vis[0]=1;
      while(!q.isEmpty())
      {
        int temp=q.poll();
        //List<Integer> t=new List<Integer>();
        List<Integer> t=rooms.get(temp);
        for(int i=0;i<t.size();i++)
        {
          if(vis[t.get(i)]==0)
          {
            vis[t.get(i)]=1;
            q.add(t.get(i));
          }
          
        }
        
      }
      
      for(int i=0;i<rooms.size();i++)
      {
        if(vis[i]==0)
          return false;
        
      }
      
      return true;
        
    }
}