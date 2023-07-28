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
      if(root.left==null && root.right==null && root.val<0)
        return root.val;
      ans=root.val;
      int a=sum(root);
      return ans;
      
        
    }
  
  int sum(TreeNode r)
  {
    if(r==null)
      return 0;
    int lst=sum(r.left);
    int rst=sum(r.right);
    int inter1=Math.max(0,lst);
    int inter2=Math.max(0,rst);
    ans=Math.max(ans,r.val+inter1+inter2);
    return r.val+Math.max(inter1,inter2);
    
  }
}