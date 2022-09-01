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

    public int goodNodes(TreeNode root) {
        int count = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode cur = q.poll();
            if (cur.left != null) {
                if (cur.left.val >= cur.val) {
                    count++;
                } else cur.left.val = cur.val;

                q.add(cur.left);
            }
            if (cur.right != null) {
                if (cur.right.val >= cur.val) {
                    count++;
                } else cur.right.val = cur.val;

                q.add(cur.right);
            }
        }
        return count;
    }
}
