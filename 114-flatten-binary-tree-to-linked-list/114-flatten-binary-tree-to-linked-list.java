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
    List<Integer> l = new ArrayList<>();
    
    public void flatten(TreeNode root) {
        if(root==null || (root.left==null && root.right==null)) return;
        preOrder(root);
        root.val = l.get(0);
        TreeNode cur = root;
        for(int i=1;i<l.size();i++){
            cur.left = null;
            cur.right = new TreeNode(l.get(i));
            cur = cur.right;
        }
    }
    
    public void preOrder(TreeNode root){
        l.add(root.val);
        if(root.left!=null) preOrder(root.left);
        if(root.right!=null) preOrder(root.right);
    }
    
    // public TreeNode gen(TreeNode root){
    //     root = new TreeNode(l.get(0));
    //     TreeNode cur = root;
    //     for(int i=1;i<l.size();i++){
    //         cur.right = new TreeNode(l.get(i));
    //         cur = cur.right;
    //     }
    // }
}
