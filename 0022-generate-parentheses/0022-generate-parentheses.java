class Solution {
  List<String> ans=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
      if(n==0)
        return ans;
      generate(0,0,"",n);
      return ans;
        
    }
  
  void generate(int lc,int rc,String temp,int n)
  {
    if(lc==rc && lc+rc==2*n)
    {
      ans.add(temp);
      return;
      
    }
    
    if(lc==rc)
      generate(lc+1,rc,temp+'(',n);
    else if( lc>rc)
    {
      if(lc==n)
        generate(lc,rc+1,temp+')',n);
      else
      {
        generate(lc+1,rc,temp+'(',n);
        generate(lc,rc+1,temp+')',n);
      } 
      
    }
    
  }
  
  
}