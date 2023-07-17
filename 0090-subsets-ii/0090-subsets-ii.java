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
    //base condition
    
    
    if(curr_idx==nums.length)
      
    {
      
      
       Collections.sort(temp);
     //  System.out.println("temp="+temp);
     //System.out.println("ans="+ans);
      if(ans.contains(temp)==false)
      {
        ans.add(new ArrayList<>(temp));
        
        
      }
      return;
      
    }
    
    helper(ans,temp,curr_idx+1,nums);
    temp.add(nums[curr_idx]);
    helper(ans,temp,curr_idx+1,nums);
    temp.remove(temp.size()-1);
  // helper(ans,temp,curr_idx+1,nums);
    
    
  }
}