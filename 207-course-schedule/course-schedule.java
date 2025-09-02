class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 0; i<numCourses; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] i: prerequisites){
            adj.get(i[0]).add(i[1]);
        }
        
        int[] degree = new int[numCourses];
        
        for(int[] i: prerequisites){
            degree[i[1]]++;
        }
        
        for(int i = 0; i<numCourses; i++){
            if(degree[i] == 0)
                q.add(i);
        }
        
        int cnt = 0;
        while(!q.isEmpty()){
            Integer curr = q.remove();
            cnt++;
            
            for(int i: adj.get(curr)){
                degree[i]--;
                if(degree[i] == 0){
                    q.add(i);
                }
            }
        }
        
        if(cnt == numCourses){
            return true;
        }
        return false;
    }
}