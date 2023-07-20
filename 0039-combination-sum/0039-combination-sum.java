class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
      List<List<Integer>> ans=new ArrayList<>();
      helper(ans,new ArrayList<>(),target,0,candidates);
      return ans;
      
    }
  
  void helper(List<List<Integer>> ans,List<Integer> temp, int target,int start,int[] candidates)
  {
    if(target<0)
      return;
    else if(target==0)
      ans.add(new ArrayList<>(temp));
    else
    {
      
      for(int i=start;i<candidates.length;i++)
      {
        temp.add(candidates[i]);
        helper(ans,temp,target-candidates[i],i,candidates);
        temp.remove(temp.size()-1);
        
      }
        
      
    }
    
    
  }
}