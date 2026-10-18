class Solution {
    public int maxScore(int[] cardP, int k) {
        // total sum - (sum of min of (window n-k));
        int c=cardP.length;
        int sum=0;
        int n=cardP.length;
        for(int point:cardP){
            sum+=point;
        }
        if(n==k){
            return sum;
        }
        int minS=0;
        int windS=0;
        int wsize=n-k;
        for(int i=0;i<n-k;i++){
            windS+=cardP[i];
        }
        minS=windS;
        for(int i=wsize;i<n;i++){
            windS=windS-cardP[i-wsize]+cardP[i];
            minS=Math.min(windS,minS);

        }
        return sum-minS;
        
    }
}