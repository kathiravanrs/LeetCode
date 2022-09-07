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
    public String tree2str(TreeNode root) {
        StringBuilder b = new StringBuilder();
        if(root!=null){
            b.append(root.val);
            if(root.left!=null || (root.right!=null)){
                b.append("(");
                b.append(tree2str(root.left));
                b.append(")");
            }
            if(root.right!=null){
                b.append("(");
                b.append(tree2str(root.right));
                b.append(")");
            }
        }
        return b.toString();
    }
}