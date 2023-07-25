class Solution {
  
  List<List<Integer>> ans=new ArrayList<>();
  List<Integer> temp=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
      for(int i=0;i<nums.length;i++)
        temp.add(nums[i]);
      
      generate(nums,0,temp,ans);
      return ans;
        
    }
  
  void generate(int[] nums,int idx,List<Integer> temp,List<List<Integer>> ans)
  {
    if(idx==nums.length)
    {
      //System.out.println(temp);
      ans.add(new ArrayList(temp));
      return;
      
    }
    
    for(int i=idx;i<nums.length;i++)
    {
      Collections.swap(temp,idx,i);
     // temp.add(nums);
     // System.out.println(temp);
      generate(nums,idx+1,temp,ans);
      Collections.swap(temp,i,idx);
    //  System.out.println("*****"+temp);
     // temp.remove(temp.size()-1);
      
    }
    
  }
}
  