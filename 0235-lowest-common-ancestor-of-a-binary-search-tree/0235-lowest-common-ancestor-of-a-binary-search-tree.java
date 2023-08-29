/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/*

//recursive
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      if(root==null)
        return null;
      int curr=root.val;
      if(curr<p.val && curr<q.val)
        return lowestCommonAncestor(root.right,p,q);
      if(curr>p.val && curr>q.val)
        return lowestCommonAncestor(root.left,p,q);
      return root;
      
        
    }
} */

//iterative
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (true) {
            if (root.val > p.val && root.val > q.val)
                root = root.left;
            else if (root.val < p.val && root.val < q.val)
                root = root.right;
            else
                return root;
        }
    }
}