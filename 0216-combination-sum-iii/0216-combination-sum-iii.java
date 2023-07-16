class Solution {
  List<List<Integer>> ans=new ArrayList<>();
  List<Integer> temp=new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
      
      int arr[]=new int[9];
      for(int i=0;i<9;i++)
        arr[i]=i+1;
      
      generate(ans,temp,k,n,arr,0,0);
     return ans;
        
    }
  
  void generate(List<List<Integer>> ans, List<Integer> temp, int k,int n, int arr[], int i,int sum)
  {
    if(i==9)
    {
     // System.out.println("i="+i);
     // System.out.println("n="+n);
     // System.out.println(sum);
     // System.out.println(temp);
      if(temp.size()==k && sum==(-1*n))
      {
       // System.out.println("here");
        ans.add(new ArrayList(temp));
      }
      return;
    }
   // System.out.println("Sum="+sum);
   //  System.out.println("temp="+temp);
     temp.add(arr[i]);
    generate(ans,temp,k,n,arr,i+1,sum-arr[i]);
    //temp.add(arr[i]);
    temp.remove(temp.size()-1);
    generate(ans,temp,k,n,arr,i+1,sum);
   // temp.remove(temp.size()-1);
    
    
  }
}