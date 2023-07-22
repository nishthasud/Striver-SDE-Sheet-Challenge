class Solution {
    public boolean isGood(int[] nums) {
      int highest=0;
      //if(nums.length==0)
      for(int i=0;i<nums.length;i++)
      {
        highest=Math.max(highest,nums[i]);
        
      }
      
      
      int[] arr=new int[highest+1];
    //  System.out.println(arr.length);
    //  System.out.println(nums.length);
      if((nums.length<arr.length)|| (nums.length>arr.length))
      {
     //   System.out.println("yes");
        return false;
      }
      
     // System.out.println("**");
      for(int i=0;i<arr.length-1;i++)
      {
        arr[i]=i+1;
        
        
      }
     // System.out.println("$");
      arr[arr.length-1]=highest;
     //for(int i=0;i<arr.length;i++)
        
    //System.out.println("&&&&"+arr[i]);
    //  List<List<Integer>> list=new ArrayList<>();
    //  System.out.println("%%%");
    //  List<Integer> temp=new ArrayList<>();
      Arrays.sort(nums);int count=0;
      for(int i=0;i<nums.length;i++)
      {
      //  int a=binarySearch(arr,nums[i]);
         System.out.println("&&&"+arr[i]);
        System.out.println("****&&&"+nums[i]);
        if(nums[i]!=arr[i])
          count++;
      //  System.out.println(a);
      //  if(a==-1)
      //    return false;
        
      }
      
     //  temp.add(nums[i]);
     // Collections.sort(temp);
     // backtrack(list, new ArrayList<>(), arr, new boolean[nums.length]);
   //  System.out.println(count);
      if(count==0)
      return true;
      else
        return false;
        
        
    }
  
  /*
  
  private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, boolean [] used){
    if(tempList.size() == nums.length){
        list.add(new ArrayList<>(tempList));
    } else{
        for(int i = 0; i < nums.length; i++){
            if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i - 1]) continue;
            used[i] = true; 
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, used);
            used[i] = false; 
            tempList.remove(tempList.size() - 1);
        }
    }
}
*/
}