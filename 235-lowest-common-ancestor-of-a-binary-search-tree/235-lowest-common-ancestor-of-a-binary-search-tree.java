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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode r = root;
        Set<TreeNode> set = new HashSet<>();
        while(r!=null){
            if(r == p) {
                set.add(r);
                break;
            }
            set.add(r);
            if(r.val>p.val){
                r = r.left;
            }else r = r.right;
            
        }
        TreeNode ans = root;
        r = root;
        while(r!=null){
            if(r == q) {
                    if(set.contains(r)) ans = r;
        
                break;
            }
            if(set.contains(r)) ans = r;
            if(r.val>q.val){
                r = r.left;
            }else r = r.right;
            
        }
        return ans;
    }
}