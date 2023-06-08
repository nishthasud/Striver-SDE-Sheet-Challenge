//done myself
class Solution {
    public int maxProfit(int[] prices) {
      int preMin[]=new int[prices.length];
        int sufMax[]=new int[prices.length];
        int ans=0;
        
       
        
        preMin[0]=prices[0];
        for(int i=1;i<prices.length;i++)
            preMin[i]=Math.min(preMin[i-1],prices[i]);
        
        sufMax[prices.length-1]=prices[prices.length-1];
        for(int j=prices.length-2;j>=0;j--)
            sufMax[j]=Math.max(sufMax[j+1],prices[j]);
        
        
        for(int i=0;i<prices.length;i++)
        {
            
            ans=Math.max(sufMax[i]-preMin[i],ans);
        }
            
        return ans;
        
    }
}

/* 
 int preMin[]=new int[prices.length];
        int sufMax[]=new int[prices.length];
        int ans=0;
        
       
        
        preMin[0]=prices[0];
        for(int i=1;i<prices.length;i++)
            preMin[i]=Math.min(preMin[i-1],prices[i]);
        
        sufMax[prices.length-1]=prices[prices.length-1];
        for(int j=prices.length-2;j>=0;j--)
            sufMax[j]=Math.max(sufMax[j+1],prices[j]);
        
        
        for(int i=0;i<prices.length;i++)
        {
            
            ans=Math.max(sufMax[i]-preMin[i],ans);
        }
            
        return ans;

// method 2  O(n) complexity

public int maxProfit(int[] prices) {
      int profit=0,mini=prices[0];
      
        
       for(int i=1;i<prices.length;i++)
       {
        int cost=prices[i]-mini;
         profit=Math.max(profit,cost);
         mini=Math.min(mini,prices[i]);
         
       }
      return profit;
        
    }
*/