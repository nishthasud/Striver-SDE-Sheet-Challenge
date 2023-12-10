class Solution {
    public int rob(int[] nums) {
      int dp[]=new int[nums.length];
      Arrays.fill(dp,-1);
     int ans= f(nums,nums.length-1,dp);
      return ans;
        
    }
  
  int f(int[] nums, int idx,int[] dp)
  {
    
    if(idx==0)
      return nums[0];
  if(idx<0)
    return 0;
    if(dp[idx]!=-1)
      return dp[idx];
  int pick=nums[idx]+f(nums,idx-2,dp);
  int notpick=f(nums,idx-1,dp);
    dp[idx]=Math.max(pick,notpick);
  return dp[idx];
}
}