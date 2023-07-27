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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
      List<List<Integer>> ans=new ArrayList<>();
      if(root==null)
        return ans;
      Queue<TreeNode> q=new LinkedList<>();
      int level=0;
      q.add(root);
      while(!q.isEmpty())
      {
        int sz=q.size();
        List<Integer> interim=new ArrayList<>();
        for(int i=0;i<sz;i++)
        {
          TreeNode temp=q.poll();
          interim.add(temp.val);
        //  System.out.println(interim);
          
            if(temp.left!=null)
              q.add(temp.left);
            if(temp.right!=null)
              q.add(temp.right);
            
         
          
        }
       if(level%2!=0)
       {
         Collections.reverse(interim);
         ans.add(interim);
       }
        else
        ans.add(interim);
        level++;
        
              
        
      }
      return ans;
        
    }
  
    
}