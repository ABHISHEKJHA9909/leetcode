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
        List<List<Integer>> res=new ArrayList<>();
        
        Queue<TreeNode>q=new LinkedList<TreeNode>();
        if(root!=null)
            q.add(root);
        
        while(q.size()>0){
            int n=q.size();
            List<Integer>l=new ArrayList<Integer>();
            for(int i=0;i<n;i++){
                root=q.poll();
                if(root.left!=null)
                    q.add(root.left);
                if(root.right!=null)
                    q.add(root.right);
                l.add(root.val);
            }
            res.add(l);
        }
        
        return res;
    }
}