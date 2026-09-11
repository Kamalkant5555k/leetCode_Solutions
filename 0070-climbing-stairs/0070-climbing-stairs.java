class Solution {
    public int climbStairs(int n) {
    //     if(n==1 || n==0){
    //         return 1;
    //     }
    //     return climbStairs(n-1)+climbStairs(n-2);
        
    // } time Limit Exceeded

    if(n<=1){
        return 1;
    }
    int[] cs=new int[n+1];
     cs[0]=1;
     cs[1]=1;
    for(int i=2;i<=n;i++){
        cs[i]=cs[i-1]+cs[i-2];
    }
    return cs[n];
    }
}