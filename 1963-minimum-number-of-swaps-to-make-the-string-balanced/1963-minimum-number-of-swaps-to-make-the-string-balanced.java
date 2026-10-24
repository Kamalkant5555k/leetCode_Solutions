class Solution {
    public int minSwaps(String s) {

        // Not work--
        // int l=0;
        // int h=s.length()-1;
        // int count=0;
        // while(l<h){
        //     if((s.charAt(l)==']') && (s.charAt(h)=='[')){
        //         count++;
        //         l++;
        //         h--;
        //     }else if((s.charAt(l)=='[') && (s.charAt(h)==']')){
        //         l++;
        //         h--;
        //     }else if(s.charAt(l)=='['){
        //         l++;
        //     }else{
        //         h--;
        //     } 
        // }
        // return (count+1)/2;

        int balance=0;
        int maxSwap=0;
        for(char ch:s.toCharArray()){
            if(ch=='['){
                balance++;
            }else{
                balance--;
            }
           maxSwap= Math.max(maxSwap,-balance);
        }
        return (maxSwap+1)/2;
        
    }
}