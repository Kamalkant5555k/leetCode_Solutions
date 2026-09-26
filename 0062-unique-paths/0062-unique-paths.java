// class Solution {

//     // helper function
//     static int paths(int cr, int cc, int lr, int lc) {
//         // reached destination
//         if (cr == lr && cc == lc) {
//             return 1;
//         }
//         // out of grid
//         if (cr > lr || cc > lc) {
//             return 0;
//         }
//         int right = paths(cr, cc + 1, lr, lc);
//         int down  = paths(cr + 1, cc, lr, lc);

//         return right + down;
//     }

//     public int uniquePaths(int m, int n) {
//         return paths(0, 0, m - 1, n - 1);
//     }
// }


class Solution {
    static int[][] dp;

    // helper function
    static int paths(int cr, int cc, int lr, int lc) {
        // reached destination
        if (cr == lr && cc == lc) {
            return 1;
        }
        // out of grid
        if (cr > lr || cc > lc) {
            return 0;
        }
        if(dp[cr][cc]!=0){
            return dp[cr][cc];
        }
        int right = paths(cr, cc + 1, lr, lc);
        int down  = paths(cr + 1, cc, lr, lc);

        dp[cr][cc] =right + down;
        return dp[cr][cc];
    }

    public int uniquePaths(int m, int n) {
        dp=new int[m+1][n+1];
        return paths(0, 0, m - 1, n - 1);
    }
}
