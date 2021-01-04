class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
    List<List<Integer>> adjacencyList = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        int[] result = new int[numCourses];
        int[] indegree = new int[numCourses];
        for(int i=0; i<numCourses; i++) {
            adjacencyList.add(new ArrayList<>());
        }
        
        for(int course[] : prerequisites) {
            int prevCourse = course[1];
            int nextCourse = course[0];
            adjacencyList.get(prevCourse).add(nextCourse);
            indegree[nextCourse]++;
        }
        
        for(int course=0; course<numCourses; course++) {
            if(indegree[course]==0) {
                queue.offer(course);
            }
        }
        
        int resultIndex = 0;
        while(!queue.isEmpty()) {
            Integer currCourse = queue.poll();
            result[resultIndex++] = currCourse;
            for(int course: adjacencyList.get(currCourse)) {
                indegree[course]--;
                if(indegree[course] == 0) {
                    queue.offer(course);
                }
            }
        }
        
        if(resultIndex != numCourses) return new int[]{};
        return result;
    }
}
