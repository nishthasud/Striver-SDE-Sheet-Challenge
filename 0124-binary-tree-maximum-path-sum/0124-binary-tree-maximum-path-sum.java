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
  int ans=0;
    public int maxPathSum(TreeNode root) {
      
      ans=root.val;
      if(root.left==null &&root.right==null)
      return ans;
      int a=helper(root);
      return ans;
        
    }
  
  
  int helper(TreeNode r)
  {
    if(r==null)
      return 0;
      int lst=helper(r.left);
      int rst=helper(r.right);
      int inter1=Math.max(0,lst);
      int inter2=Math.max(0,rst);
      ans=Math.max(ans,r.val+inter1+inter2);
      return r.val+Math.max(inter1,inter2);
    
    
  }
}