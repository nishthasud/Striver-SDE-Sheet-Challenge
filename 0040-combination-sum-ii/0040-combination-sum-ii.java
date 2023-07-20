class Solution {
  List<List<Integer>> ans=new ArrayList<>();
  List<Integer> temp=new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
   // System.out.println(candidates.length);

      if(candidates.length==0)
        return ans;
      Arrays.sort(candidates);
      generate(ans,temp,candidates,target,0);
     
      
      return ans;
        
    }
  
     void generate(List<List<Integer>> ans,List<Integer>temp, int[] candidates,int target,int start)
     {
       if(target<0)
         return;
       
       
        else if(ans.contains(temp)==false && target==0)
         {  
           System.out.println("temp"+temp);
           ans.add(new ArrayList(temp));
           
         }
        
         else
       
     
       
     // System.out.println("temp"+temp);
   //  System.out.println("sum"+sum);
      for(int i=start;i<candidates.length;i++)
       {
         if(i>start && candidates[i]==candidates[i-1])
           continue;
         
         temp.add(candidates[i]);
         generate(ans,temp,candidates,target-candidates[i],i+1);
         temp.remove(temp.size()-1);
       }
       
     }
       
}