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
    public List<List<Integer>> levelOrder(TreeNode root) {
      List<List<Integer>> ans=new ArrayList<>();
      Queue<TreeNode> q=new LinkedList<>();
      if(root==null)
        return ans;
      q.add(root);
      while(!q.isEmpty())
      {
        List<Integer> t=new ArrayList<>();
        int sz=q.size();// always calculate this and keep separately to maintain level order
        
        for(int i=0;i<sz;i++)
        {
          TreeNode temp=q.poll();
          t.add(temp.val);
          if(temp.left!=null)
            q.add(temp.left);
          if(temp.right!=null)
            q.add(temp.right);
          
        
        }
        ans.add(t);
        
      }
      return ans;
        
    }
}