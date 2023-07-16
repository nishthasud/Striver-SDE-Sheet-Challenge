class Solution {
    public boolean isPalindrome(int x) {
        String a=String.valueOf(x);
        char ch[]=a.toCharArray();
        int start=0,end=ch.length-1;
      while(start<=end)
      {
        char temp=ch[start];
        ch[start]=ch[end];
        ch[end]=temp;
        start++;
        end--;
      }
      
      String b=String.valueOf(ch);
      if(a.equals(b)==true)
        return true;
      else
        return false;
    }
}