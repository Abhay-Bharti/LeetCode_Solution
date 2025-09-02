class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> safe = new ArrayList<>();
        boolean[] vis = new boolean[graph.length];
        boolean[] stack = new boolean[graph.length];
        boolean[] check = new boolean[graph.length];

        for(int i = 0; i<graph.length; i++){
            dfs(i, graph, vis, stack, check);
            if(check[i]){
                safe.add(i);
            }
        }

        return safe;
    }

    private boolean dfs(int node, int[][] graph, boolean[] vis, boolean[] stack, boolean[] check){
        vis[node] = true;
        stack[node] = true;

        for(int i: graph[node]){
            if(stack[i]){
                return true;
            }
            if(!vis[i] && dfs(i, graph, vis, stack, check))
                return true;
        }

        check[node] = true;
        stack[node] = false;
        return false;
    }
}