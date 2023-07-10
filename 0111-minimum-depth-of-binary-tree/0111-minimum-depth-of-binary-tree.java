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
    public int minDepth(TreeNode root) {
        if(root==null)
        {
           // System.out.println("here");
       return 0;
        }
       return helper(root);
        
        
    }
    int helper(TreeNode r)
    {
        if(r==null)
        return (100000+1);
        if(r.left==null && r.right==null)
        return 1;
        int lst=helper(r.left);
       // System.out.println("lst="+lst+"val"+r.val);
        int rst=helper(r.right);
       //  System.out.println("rst="+rst);
        int ans=1+Math.min(lst,rst);
       // System.out.println(ans);
        return ans;
    }
}