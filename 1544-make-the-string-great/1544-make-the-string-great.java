class Solution {
    public String makeGood(String s) {
       char ch[]=s.toCharArray();
      String ans="";
      Stack<Character> st=new Stack<>();
      st.push(ch[0]);
      for(int i=1;i<ch.length;i++)
      {
        if(!st.isEmpty())
        {
        Character p=st.peek();
        if((int)p==(int)ch[i]+32 ||  (int)p==(int)ch[i]-32)
        {
          Character a=st.pop();
        }
        else
          st.push(ch[i]);
        }
        else
          st.push(ch[i]);
        
      }
      
      while(!st.isEmpty())
      {
        ans=st.pop()+ans;
        
      }
      
      return ans;
    }
}