class Solution {
    static int[][] dp;
    public int uniquePathsWithObstacles(int[][] Grid) {
        int r=Grid.length;
        int c=Grid[0].length;
   
        dp=new int[r][c];
        return helper(0,0,r-1,c-1,Grid);
    }
    public int helper(int cr,int cc,int fr,int fc,int[][] Grid){
        if (Grid[cr][cc] == 1) {
       return 0;
      }
        if(cr==fr && cc==fc){
            return 1;
        }
        // out of bound--
        int right=0;
        int left=0;
        if(cr>fr || cc>fc){
            return 0;
        }
        if(dp[cr][cc]!=0){
            return dp[cr][cc];
        }
        if(cr+1<=fr && Grid[cr+1][cc]!=1){
          right=helper(cr+1,cc,fr,fc,Grid);
        }
        if(cc+1<=fc && Grid[cr][cc+1]!=1){
          left=helper(cr,cc+1,fr,fc,Grid);
        }
        dp[cr][cc]= right+left;
        return dp[cr][cc];
    }

}