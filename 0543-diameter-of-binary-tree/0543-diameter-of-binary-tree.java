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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
          return 0;
      int a=getHt(root);
      return ans;
    }
  
  int getHt(TreeNode root)
  {
    if(root==null)
      return 0;
    int lst=getHt(root.left);
    int rst=getHt(root.right);
    ans=Math.max(ans,lst+rst);
    
    return 1+Math.max(lst,rst);
    
  }
}