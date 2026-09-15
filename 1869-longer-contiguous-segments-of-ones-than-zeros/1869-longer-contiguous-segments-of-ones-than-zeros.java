class Solution {
    public boolean checkZeroOnes(String s) {
        int ones=0;
        int zeros=0;
        int n=s.length();
        int MaxOnes=0;
        int MaxZeros=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                ones++;
                MaxOnes=Math.max(MaxOnes,ones);
                zeros=0;
            }else{
                zeros++;
                MaxZeros=Math.max(MaxZeros,zeros);
                ones=0;
            }
        }
        if(MaxOnes>MaxZeros){
            return true;
        }
        return false;
        
    }
}