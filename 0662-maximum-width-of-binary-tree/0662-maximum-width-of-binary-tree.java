/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        int ans=0;
      if(root==null)
        return ans;
      Queue<Pair> q=new LinkedList<>();
      q.add(new Pair(root,0));
      while(!q.isEmpty())
      {
        
        int sz=q.size();
        int mmin=q.peek().idx;
        int first=0,last=0;
        for(int i=0;i<sz;i++)
        {
          int cur_idx=q.peek().idx-mmin;
          Pair p=q.poll();
          TreeNode temp=p.node;
          if(i==0)
            first=cur_idx;
          if(i==sz-1)
            last=cur_idx;
         
          
         // interim.add(temp.val);
         // if(temp.left.left==null )
          if(temp.left!=null)
            q.add(new Pair(temp.left,2*cur_idx+1));
          
          if(temp.right!=null)
            q.add(new Pair(temp.right,2*cur_idx+2));
          
          
          
         // if(temp.right.right==null)
           // q.add(temp.right);
        }
      //  System.out.println(interim);
      //  ans=Math.max(ans,interim.size());
        ans=Math.max(ans,last-first+1);
          
          
        
        
        
        
      }
      return ans;
    }
}

class Pair
{
  TreeNode node;
  int idx;
  Pair(TreeNode node, int idx)
  {
    this.node=node;
    this.idx=idx;
    
  }
  
}