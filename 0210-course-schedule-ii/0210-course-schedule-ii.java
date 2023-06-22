class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
      List<List<Integer>> adj=new ArrayList<>();
      for(int i=0;i<numCourses;i++)
      {
        adj.add(new ArrayList<Integer>());
        
      }
      
      for(int i=0;i<prerequisites.length;i++)
      {
       // ArrayList<Integer> temp=new ArrayList<>();
        adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        
        
      }
      
      // bfs topo sort over the adjacency list
      
      int indegree[]=new int[numCourses];
      Arrays.fill(indegree,0);
      
      for(int i=0;i<numCourses;i++)
      {
        List<Integer> temp=new ArrayList<>();
         temp= adj.get(i);
        for(int j=0;j<temp.size();j++)
        {
          indegree[temp.get(j)]++;
          
        }
        
      }
       int count=numCourses-1;
      int[] ans=new int[numCourses];
      
      Queue<Integer> q=new LinkedList<>();
      for(int i=0;i<numCourses;i++)
      {
        System.out.println("Indegree"+i+indegree[i]);
        if(indegree[i]==0)
        {
          q.add(i);
          ans[count]=i;
          count--;
          
        //  System.out.println("###");
        }
        
      }
     
      
      while(!q.isEmpty())
      {
        int a=q.poll();
      //  System.out.println("***"+a);
      //  ans[count]=a;
       // count++;
        List<Integer> temp=new ArrayList<>();
        temp=adj.get(a);
        for(int i=0;i<temp.size();i++)
        {
          indegree[temp.get(i)]--;
            if((indegree[temp.get(i)])==0)
            {
              q.add(temp.get(i));
              ans[count]=temp.get(i);
              count--;
              
            }
        }
        
      }
                      System.out.println("count"+count);       
         if(count==-1)
                             return ans;
                             else
                             return new int[0];
      
        
    }
}