class Solution {
  String a="";
    public int longestCommonSubsequence(String text1, String text2) {
      
      int dp[][]=new int[text1.length()][text2.length()];
      
      for(int i=0;i<text1.length();i++)
      {
        for(int j=0;j<text2.length();j++)
        {
          dp[i][j]=-1;
          
        }
        
      }
      
      int ans=f(text1.length()-1,text2.length()-1,text1,text2,dp);
   //   System.out.println(a);
     
      return ans;
        
    }
  
  int f(int idx1,int idx2,String text1,String text2,int dp[][])
  {
    if(idx1<0 || idx2<0)
      return 0;
    
    if(dp[idx1][idx2]!=-1)
      return dp[idx1][idx2];
    
    // match case
    if(text1.charAt(idx1)==text2.charAt(idx2))
    {
   //   a=text1.charAt(idx1)+a;
       dp[idx1][idx2]=1+f(idx1-1,idx2-1,text1,text2,dp);
      
      return dp[idx1][idx2];
    }  
       
    // not match
    dp[idx1][idx2]=0+Math.max(f(idx1-1,idx2,text1,text2,dp),f(idx1,idx2-1,text1,text2,dp));
    return dp[idx1][idx2];
    
    
    
    
  }
}