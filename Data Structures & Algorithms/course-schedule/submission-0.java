class Solution {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<numCourses; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] d: prerequisites){
            adj.get(d[1]).add(d[0]);
        }
        boolean[] visited = new boolean[numCourses];
        boolean[] inCurrPath = new boolean[numCourses];

        for(int i=0;i<numCourses;i++){
            if(!visited[i] && hasCycle(adj, i, visited, new boolean[numCourses])){
                return false;
            }
        }
        return true;
    }

    private boolean hasCycle(List<List<Integer>> adj, int i, boolean[] visited, boolean[] inCurrPath){
        if(inCurrPath[i]){
            return true;
        }
        if(visited[i]){
            return false;
        }

        inCurrPath[i] = true;
        visited[i] = true;

        for(int neighbour: adj.get(i)){
            if(hasCycle(adj, neighbour, visited, inCurrPath)){
                return true;
            }
        }

        inCurrPath[i]= false;
        return false;
    }
}
