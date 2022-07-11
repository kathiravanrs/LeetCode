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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root==null) return l;
        q.add(root);
        q.add(null);
        int prev = 0;
        while(!q.isEmpty()){
            TreeNode node  =q.remove();
            if(node!=null) {
                prev = node.val;
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            else{
                if(prev==101) break;
                l.add(prev);
                q.add(null);
                prev = 101;
            }
        }
        return l;
    }
}