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
    public int minDiffInBST(TreeNode root) {
        Set<Integer> set = new TreeSet<>();
        int min = Integer.MAX_VALUE;
        add(root, set);
        List<Integer> arr = new ArrayList<>();
        arr.addAll(set);
        for(int i=1; i<set.size();i++){
            min = Math.min(min,(Math.abs(arr.get(i)-arr.get(i-1))));
        }
        // System.out.println(arr);
        return min;
    }
    public void add(TreeNode root, Set<Integer> set){
        if(root == null) return;
        
        set.add(root.val);
        add(root.left, set);
        add(root.right, set);
    }
}