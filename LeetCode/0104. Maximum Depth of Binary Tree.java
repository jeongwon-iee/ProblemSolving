class Solution {
  public int maxDepth(TreeNode root) {
      if(root == null) return 0;
      
      Queue<TreeNode> queue = new LinkedList<>();
      int depth = 0;
      queue.offer(root);
      while(!queue.isEmpty()) {
          int size = queue.size();
          for(int i=0; i<size; i++) {
              TreeNode currNode = queue.poll();
              if(currNode.left != null) queue.offer(currNode.left);
              if(currNode.right != null) queue.offer(currNode.right);
          }
          depth++;
      }
      return depth;
  }
}
