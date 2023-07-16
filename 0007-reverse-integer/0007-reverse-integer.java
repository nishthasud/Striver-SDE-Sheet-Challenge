class Solution {
    public int reverse(int x) {
      int flag=0;
      // track if input no is positive or negative
      int absX=x;
      if(x<0)
      {
       // System.out.println("Negative");
        if(Integer.MIN_VALUE==x)
        return 0;
        else
        {  
        absX=(x)*(-1);
      //  System.out.println(absX);
        flag=1;
        }
      }
      
      String a=String.valueOf(absX);
      //System.out.println(a);
      char b[]=a.toCharArray();
      int start=0,end=b.length-1;
     while(start<=end)
     {
       char temp=b[start];
      // System.out.println("temp="+temp);
      b[start]=b[end];
       b[end]=temp;
       start++;
       end--;
       
       
     }
      String c=String.valueOf(b);
      int i=0;
     // System.out.println("c="+c);
     while(c.charAt(i)==0)
     {
      
       i++;
       
     }
      String temp="";
     
      temp=c.substring(i);
      
      if(flag!=1)
      {
     //   System.out.println(temp);
        long test = Long.parseLong(temp);
    if (test > Integer.MAX_VALUE )
        
    
        return 0;
        else 
          return Integer.parseInt(temp);
             
      }
      
      else
      {
        long test = Long.parseLong(temp)*-1;
        if(test< Integer.MIN_VALUE)
          return 0;
        else
          return ((int)test);
      }
    }
}