class Solution {
    public String reverseWords(String s) {
      s=s+" ";
      int start=0;String ans="",temp="";
      for(int i=0;i<s.length();i++)
      {
        System.out.println("****"+i);
        if((s.charAt(i)==' ') && i<=s.length()-1)
        {
          if(i==s.length()-1)
          ans=ans+temp;
          else 
            ans=ans+temp+" ";
           temp="";
          System.out.println("%%%%%%");
          start=i+1;
        }
        else
        {
          System.out.println("$$$");
          temp=s.charAt(i)+temp;
        }
        
      }
      return ans;
        
    }
}