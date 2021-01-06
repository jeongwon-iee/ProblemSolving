class Solution {
    public int maxDepth(Node root) {
        if (root == null) {
          return 0;
        }
        if (root.children.isEmpty()) {
          return 1;  
        }
        
        List<Integer> heights = new LinkedList<>();
        for (Node child : root.children) {
            heights.add(maxDepth(child)); 
        }
        return Collections.max(heights) + 1;
    }
}
