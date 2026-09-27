class Solution {
    List<List<Integer>>result= new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer>path=new ArrayList<>();
        path.add(0);
        dfs(0,path,graph);
        return result;
        
    }
    public void dfs(int node,List<Integer>path,int[][] graph){
        int n=graph.length;
        if(node==n-1){
            result.add(new ArrayList<>(path));
        }
        for(int nbr :graph[node]){
            path.add(nbr);
            dfs(nbr,path,graph);
            path.remove(path.size()-1);
        }
    }
}