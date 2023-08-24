/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
      List<Integer> ans=new ArrayList<>();
      if(root==null)
        return ans;
      Map<TreeNode,TreeNode> parent_track=new HashMap<>();
      markParents(root,parent_track);
      
      Map<TreeNode,Boolean> vis=new HashMap<>();
      Queue<TreeNode> q=new LinkedList<>();
      int curr_level=0;
      q.add(target);
      vis.put(target,true);
      while(!q.isEmpty())
      {
        int sz=q.size();
        if(curr_level==k)
          break;
        curr_level++;
        for(int i=0;i<sz;i++)
        {
          TreeNode t=q.poll();
          if(t.left!=null && vis.get(t.left)==null)
          {
            q.add(t.left);
            vis.put(t.left,true);
            
          }
          if(t.right!=null && vis.get(t.right)==null)
          {
            q.add(t.right);
            vis.put(t.right,true);
            
          }
          if(parent_track.get(t)!=null && vis.get(parent_track.get(t))==null)
          {
            q.add(parent_track.get(t));
            vis.put(parent_track.get(t),true);
          }
          
        }
        
        
      }
      
      while(q.isEmpty()==false)
      {
        TreeNode temp=q.poll();
        ans.add(temp.val);
        
      }
      
      return ans;
        
    }
  
  public void markParents(TreeNode root,Map<TreeNode,TreeNode> parent_track)
  {
    if(root==null)
      return;
    Queue<TreeNode> q=new LinkedList<>();
    q.add(root);
    while(!q.isEmpty())
    {
      int sz=q.size();
      for(int i=0;i<sz;i++)
      {
        TreeNode t=q.poll();
        if(t.left!=null)
        {
          parent_track.put(t.left,t);
          q.add(t.left);
          
        }
        if(t.right!=null)
        {
          parent_track.put(t.right,t);
          q.add(t.right);
          
        }
        
      }
      
    }
    
    
  }
  
  
}