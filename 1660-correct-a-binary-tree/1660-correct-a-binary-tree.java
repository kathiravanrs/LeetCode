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

    public TreeNode correctBinaryTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        TreeNode defect = new TreeNode();
        while (!q.isEmpty()) {
            TreeNode cur = q.remove();
            if (cur.left != null) q.add(cur.left);
            if (cur.right != null) {
                if (q.contains(cur.right)) defect = cur; 
                else q.add(cur.right);
            }
        }
        delete(root, defect.val);
        return root;
    }
    public void delete(TreeNode root, int v){
        if(root==null) return;
        if(root.left!=null && root.left.val==v) root.left=null;
        else if (root.right!=null && root.right.val==v) root.right=null;
        else{
            
        delete(root.left,v);
        delete(root.right, v);
        }
    }
}
