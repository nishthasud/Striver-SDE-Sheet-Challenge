class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
      
      for(int i=0;i<letters.length;i++)
      {
        int a=(int) target;
        int b=(int) letters[i];
        if(letters[i]==target && i<letters.length-1&& letters[i]!=letters[i+1])
          return letters[i+1];
        else if (b-a>0)
          return letters[i];
        
        
      }
      
      return letters[0];
        
    }
}