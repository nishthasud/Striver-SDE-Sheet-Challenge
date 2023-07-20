class Solution {
  List<List<Integer>> ans=new ArrayList<>();
  List<Integer> temp=new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
      
      int arr[]=new int[9];
      for(int i=0;i<9;i++)
        arr[i]=i+1;
      
      generate(ans,temp,k,n,arr,0);
     return ans;
        
    }
  
  void generate(List<List<Integer>> ans, List<Integer> temp, int k,int target, int arr[], int start)
  {
    if(target<0)
      return;
    else if(temp.size()>k)
      return;
    else if(temp.size()==k && target==0)
    {
      ans.add(new ArrayList<>(temp));
    }
    else
    {
      for(int i=start;i<arr.length;i++)
      {
        temp.add(arr[i]);
        generate(ans,temp,k,target-arr[i],arr,i+1);
        temp.remove(temp.size()-1);
      }
      
    }
    
    
  }
}