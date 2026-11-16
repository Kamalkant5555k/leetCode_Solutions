class Solution {
    static boolean ans;
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        ans=true;
        int[] vis=new int[n]; // already fill with 0
        Arrays.fill(vis,-1);
        // vis[0]=0; // 0->blue and 1->red--
        // for(int i=0;i<n;i++){
        //     if(i==0 || vis[i]==-1){
        //         bfs(i,vis,graph);
        //     }
        // }
        for(int i = 0; i < n; i++) {
                 if(vis[i] == -1) {
                  vis[i] = 0;      // Start new component with color 0
                  bfs(i, vis, graph);
                 }
            }
        return ans;
        
    }
    public void bfs(int i,int[] vis,int[][] graph){
        Queue<Integer>q=new LinkedList<>();
        q.add(i);
        while(q.size()>0){
            int front=q.remove();
            int color=vis[front];
            for(int ele:graph[front]){
                if(vis[ele]==color){
                    ans= false;
                    return;
                }
                if(vis[ele]==-1){
                    q.add(ele);
                    vis[ele]=1-color;
                }
               
            }
        }

    }
}