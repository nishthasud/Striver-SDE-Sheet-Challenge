class Solution {
     public int rob(int[] nums) {
      int dp[]=new int[nums.length];
      Arrays.fill(dp,-1);
      dp[0]=0;
      //return f(nums,nums.length-1,dp);
       if(nums.length==1)
         return nums[0];
       int temp1[]=new int[nums.length-1];
       int temp2[]=new int[nums.length-1];
       for(int i=0;i<nums.length-1;i++)
         temp1[i]=nums[i];
       int j=0;
       for(int i=1;i<nums.length;i++)
       {
         temp2[j]=nums[i];
         j++;
       }
       int ls=f(temp1,nums.length-2,dp);
       System.out.println(ls);
       Arrays.fill(dp,-1);
      dp[0]=0;
       int rs=f(temp2,nums.length-2,dp);
       System.out.println(rs);
       return Math.max(ls,rs);
      
      
        
    }
  
 
  int f(int[] nums,int idx,int dp[])
  {
    if(idx==0)
      return nums[idx];
    if(dp[idx]!=-1)
      return dp[idx];
 
    int pick=nums[idx];
    if(idx>1)
    pick+=f(nums,idx-2,dp);
    int notPick=f(nums,idx-1,dp);
    dp[idx]= Math.max(pick,notPick);
    return dp[idx];
    
  }
}