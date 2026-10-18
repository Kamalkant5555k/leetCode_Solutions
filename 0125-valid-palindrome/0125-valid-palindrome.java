class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int n=str.length();
        int j=n-1;
        int i=0;
        while(i<j){
            if(str.charAt(i)!=(str.charAt(j))){
                return false;

            }
            i++;
            j--;
        }
        return true;
        
    }
}