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
    TreeNode dummyHead = new TreeNode();
    TreeNode pointer = dummyHead;
    public TreeNode increasingBST(TreeNode root) {
        inorderHelper(root);
        return dummyHead.right;
    }
    public void inorderHelper(TreeNode root) {
        if(root == null) return;
        
        inorderHelper(root.left);
        pointer.right = new TreeNode(root.val);
        pointer = pointer.right;
        inorderHelper(root.right);
    }
}
