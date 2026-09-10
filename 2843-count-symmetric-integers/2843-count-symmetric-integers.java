class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        while(low<=high){
            if(sym(low)){
                count++;
            }
            low++;
        }
        return count;
    }
    public boolean sym(int n){
         String s = String.valueOf(n);
         int sLen=s.length();
         if(sLen%2!=0){
            return false;
         }
         int mid=sLen/2;
         int sumL=0;
         int sumR=0;
         for(int i=0;i<mid;i++){
            int num=s.charAt(i)-'0';
            sumL+=num;
         }
         for(int i=mid;i<sLen;i++){
            int num=s.charAt(i)-'0';
            sumR+=num;
         }
        return sumL==sumR;

    }
}