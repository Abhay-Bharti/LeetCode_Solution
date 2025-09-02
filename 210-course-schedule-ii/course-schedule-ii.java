class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int[] res = new int[numCourses];
        
        for(int i = 0; i<numCourses; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] i: prerequisites){
            adj.get(i[1]).add(i[0]);
        }
        
        int[] degree = new int[numCourses];
        
        for(int[] i: prerequisites){
            degree[i[0]]++;
        }
        
        for(int i = 0; i<numCourses; i++){
            if(degree[i] == 0)
                q.add(i);
        }
        
        int cnt = 0;
        while(!q.isEmpty()){
            Integer curr = q.remove();
            res[cnt++] = curr;
            
            for(int i: adj.get(curr)){
                degree[i]--;
                if(degree[i] == 0){
                    q.add(i);
                }
            }
        }
        
        if(cnt == numCourses){
            return res;
        }
        return new int[0];
    }
    
}