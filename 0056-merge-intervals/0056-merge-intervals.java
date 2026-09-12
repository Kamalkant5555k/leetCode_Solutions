class Solution {
    public int[][] merge(int[][] interval) {
        int n=interval.length;
        int k=0;
        Arrays.sort(interval,(a,b)->a[0]-b[0]);
        int[][] ans=new int[n][2];
        int start=interval[0][0];
        int end=interval[0][1];
        for(int i=1;i<n;i++){
            int s=interval[i][0];
            int e=interval[i][1];
            if(end>=s){
                end=Math.max(end,e);
            }else{
                ans[k][0]=start;
                ans[k][1]=end;
                start=s;
                end=e;
                k++;
            }
        }
         ans[k][0] = start;
        ans[k][1] = end;
        k++;
        return Arrays.copyOf(ans, k);
 
        
    }
}