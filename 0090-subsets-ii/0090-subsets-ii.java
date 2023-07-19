class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       List<List<Integer>> ans=new ArrayList<>();
      List<Integer> temp=new ArrayList<>();
      Arrays.sort(nums);
      helper(ans,temp,0,nums);
      
      return ans;
      
        
    }
  
  void helper(List<List<Integer>> ans, List<Integer> temp, int curr_idx,int nums[])
    
  {
    ans.add(new ArrayList<>(temp));
    for(int i=curr_idx;i<nums.length;i++)
      {
      if(i>curr_idx && nums[i-1]==nums[i])
        continue;
      temp.add(nums[i]);
      helper(ans,temp,i+1,nums);
      temp.remove(temp.size()-1);
      
    }
    
    
    
    
  }
}