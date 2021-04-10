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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        
        List<List<Integer>> output = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while(!queue.isEmpty()) {
            output.add(new ArrayList<>());
            TreeNode node;
            int size = queue.size();
            for(int i=0; i<size; i++) {
                node = queue.poll();
                output.get(level).add(node.val);
                if(node.left != null) queue.offer(node.left); 
                if(node.right != null) queue.offer(node.right);
            }
            level++;
        }
        return output;
    }
}
