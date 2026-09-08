class Solution {
    public int countAsterisks(String s) {
        boolean insideBars=false;
        int count=0;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i))=='|'){
                insideBars=!insideBars;
            }
            if(s.charAt(i)=='*' && !insideBars){
                count++;
            }
        }
        return count;
        
    }
}