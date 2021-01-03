class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjacencyList = new ArrayList<>();
        Queue<Integer> result = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();
        int[] indegree = new int[numCourses];
        
        for(int i=0; i<numCourses; i++) {
            adjacencyList.add(new ArrayList<>());
        }
        
        for(int i=0; i<prerequisites.length; i++) {
            int start = prerequisites[i][0];
            int end = prerequisites[i][1];
            adjacencyList.get(start).add(end);
            indegree[end]++;
        }
        
        for(int i=0; i<numCourses; i++) {
            if(indegree[i] == 0) {
                queue.offer(i);
            }
        }
        
        while(!queue.isEmpty()) {
            int currNode = queue.poll();
            result.offer(currNode);
            
            for(Integer child : adjacencyList.get(currNode)) {
                indegree[child]--;
                
                if(indegree[child] == 0)
                    queue.offer(child);
            }
        }
        if(result.size() == numCourses) return true;
        return false;
    }
}
