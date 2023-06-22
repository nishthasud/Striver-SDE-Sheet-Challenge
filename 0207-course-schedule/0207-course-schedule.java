class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
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
      
      Queue<Integer> q=new LinkedList<>();
      for(int i=0;i<numCourses;i++)
      {
        if(indegree[i]==0)
        {
          q.add(i);
        //  System.out.println("###");
        }
        
      }
      int count=0;
      
      while(!q.isEmpty())
      {
        int a=q.poll();
      //  System.out.println("***"+a);
        count++;
        List<Integer> temp=new ArrayList<>();
        temp=adj.get(a);
        for(int i=0;i<temp.size();i++)
        {
          indegree[temp.get(i)]--;
            if((indegree[temp.get(i)])==0)
              q.add(temp.get(i));
        }
        
      }
                     // System.out.println(count);       
         if(count==numCourses)
                             return true;
                             else
                             return false;
      
    }
}