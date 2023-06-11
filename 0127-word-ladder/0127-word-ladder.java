class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
      
      HashSet<String> set=new HashSet<>();
      for(int i=0;i<wordList.size();i++)
        set.add(wordList.get(i));
        
        int ans=0;
      
      Queue<Pair> q=new LinkedList<>();
      q.add(new Pair(beginWord,1));
      
      while(!q.isEmpty())
      {
        Pair p=q.poll();
        
        String word=p.w;
      //  System.out.println("***"+p.steps);
        ans=Math.max(ans,p.steps);
        char[] temp=word.toCharArray();
        for(int i=0;i<temp.length;i++)
        {
          char t1=temp[i];
          for(char ch='a';ch<='z';ch++)
          {
            
            temp[i]=ch;
            String interim=new String(temp);
          // System.out.println("&&&&"+interim);
            if(set.contains(interim))
            {
               
              set.remove(interim);
              
              q.add(new Pair(interim,p.steps+1));
             if(interim.equals(endWord))
             {
              // System.out.println("YES");
                return p.steps+1;
             }
              
            }
          }
          
          temp[i]=t1;
          
        }
        
        
        
        
        
      }
      
      
      return 0;
        
    }
}

class Pair
{
  String w;int steps;
  Pair(String w,int steps)
  {
    this.w=w;
    this.steps=steps;
    
  }
  
}