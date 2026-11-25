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
    int index = 0;

    public TreeNode bstFromPreorder(int[] preorder) {
        return buildTree(preorder, Integer.MAX_VALUE);
    }

    public TreeNode buildTree(int[] preorder, int maxValue) {

        if (index == preorder.length || preorder[index] > maxValue) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[index]);
        index++;

        root.left = buildTree(preorder, root.val);
        root.right = buildTree(preorder, maxValue);

        return root;
    }
}