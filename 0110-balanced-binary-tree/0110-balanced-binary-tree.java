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
    public boolean isBalanced(TreeNode root) {
      
      if(root==null)
        return true;
      int lst=ht(root.left);
      int rst=ht(root.right);
      if(Math.abs(lst-rst)>1)
      {
        System.out.println("here");
        return false;
      }
      boolean left=isBalanced(root.left);
      boolean right=isBalanced(root.right);
   //   System.out.println("left"+left+"val"+root.val);
   //   System.out.println(right);
      if(left==false || right==false)
        return false;
      return true;
      
        
    }
  
  int ht(TreeNode r)
  {
    if(r==null)
      return 0;
    int lst=ht(r.left);
    int rst=ht(r.right);
    return 1+Math.max(lst,rst);
    
  }
}