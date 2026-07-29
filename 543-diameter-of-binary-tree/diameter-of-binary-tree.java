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
    int max = 0;
    public int d(TreeNode root)
    {
        if(root== null) return 0;
        int lh = d(root.left);
        int rh = d(root.right);
        int ans = lh  + rh;
        if(ans>max)
        {
            max = ans;
        }
        return 1+ Math.max(rh,lh);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        d(root);
        return max;
    }
}