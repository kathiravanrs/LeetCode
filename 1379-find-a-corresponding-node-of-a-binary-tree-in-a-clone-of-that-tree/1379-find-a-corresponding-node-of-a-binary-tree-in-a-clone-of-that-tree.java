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

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        Queue<TreeNode> og = new LinkedList<>();
        Queue<TreeNode> cl = new LinkedList<>();
        og.add(original);
        cl.add(cloned);
        while (!og.isEmpty()) {
            TreeNode curOg = og.remove();
            TreeNode curCl = cl.remove();

            if(curOg.equals(target)) return curCl;
            
            if (curOg.left != null) {
                og.add(curOg.left);
                cl.add(curCl.left);
            }
            if (curOg.right != null) {
                og.add(curOg.right);
                cl.add(curCl.right);
            }
        }
        return null;
    }
}
