class Solution {
    public int minimumRecolors(String s, int k) {
        int n=s.length();
        int nW=0;
        int minW=Integer.MAX_VALUE;
        int left=0;
        for(int i=0;i<k;i++){
            char c=s.charAt(i);
            if(c=='W'){
                nW++;
            }
        }
        minW=nW;
        for(int i=k;i<n;i++){
           char c=s.charAt(i);
            if(c=='W'){
                nW++;
            }
            char prev=s.charAt(left);
            if(prev=='W'){
                nW--;
            }
            minW=Math.min(minW,nW);
            left++;

        }
        return minW;
        
    }
}