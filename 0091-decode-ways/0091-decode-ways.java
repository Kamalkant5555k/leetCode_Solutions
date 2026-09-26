// class Solution {
//     public int numDecodings(String s) {
//         return decode(s,0);   
//     }
//     public int decode(String str,int idx){
//         if(idx==str.length()){
//             return 1;
//         }
//         if(str.charAt(idx)=='0'){
//             return 0;
//             }
//         int ways=decode(str,idx+1);
//         if ((idx + 1 < str.length()) &&
//              (str.charAt(idx) == '1' ||
//              (str.charAt(idx) == '2' && str.charAt(idx + 1) <= '6'))) {
//                      ways = ways + decode(str, idx + 2);
//             }
//         return ways;
//     }

// }
class Solution {
    static int[] dp;
    public int numDecodings(String s) {
        dp=new int[s.length()];
        Arrays.fill(dp,-1);
        return decode(s,0);   
    }
    public int decode(String str,int idx){
        if(idx==str.length()){
            return 1;
        }
        if(str.charAt(idx)=='0'){
            return 0;
            }
        
        // Already Calcultated--
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int ways=decode(str,idx+1);
        if ((idx + 1 < str.length()) &&
             (str.charAt(idx) == '1' ||
             (str.charAt(idx) == '2' && str.charAt(idx + 1) <= '6'))) {
                     ways = ways + decode(str, idx + 2);
            }
            dp[idx]=ways;
        return  dp[idx];
    }

}