class Solution {
  List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
      List<Integer> temp=new ArrayList<>();
     helper(0,nums,ans,temp);
      return ans;
        
    }
  
  void  helper(int curr_index, int nums [],List<List<Integer>> ans,List<Integer> temp)               
	  {
	     //base case
		 
		 if (curr_index==nums.length)
		 {
       //System.out.println(temp);
		    ans.add(new ArrayList<>(temp));
			  return ;
		 }
		 
		 temp.add(nums[curr_index]);
		 helper(curr_index+1,nums,ans,temp);
		 temp.remove(temp.size()-1);
		 helper(curr_index+1,nums,ans,temp);
		 
	  
	  }
  
  
}