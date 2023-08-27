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
  
    public int kthSmallest(TreeNode root, int k) {
      List<Integer> ans=new ArrayList<>();
      traversal(root,ans);
      Collections.sort(ans);
      int a=ans.get(k-1);
      return a;
      
        
    }
  void traversal(TreeNode root,List<Integer> res)
  {
    if(root==null)
      return;
    res.add(root.val);
    traversal(root.left,res);
    traversal(root.right,res);
    
  }
}