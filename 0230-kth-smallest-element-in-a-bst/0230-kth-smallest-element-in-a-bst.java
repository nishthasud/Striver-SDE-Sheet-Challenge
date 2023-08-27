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
  int count=0;int ans=0;
    public int kthSmallest(TreeNode root, int k) {
     // List<Integer> ans=new ArrayList<>();
     traversal(root,k);
     // Collections.sort(ans);
     // int a=ans.get(k-1);
      return ans;
      
        
    }
  void traversal(TreeNode root,int k)
  {
    if(root==null)
      return ;
    
    traversal(root.left,k);
    count++;
  if(count==k)
    ans= root.val;
    traversal(root.right,k);
    
  //  return 0;
  }
}