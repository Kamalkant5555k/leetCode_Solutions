class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();
        if(n1>n2){
            return false;
        }
        int[] sA1=new int[26];
        int[] sA2=new int[26];
        for(int i=0;i<n1;i++){
            sA1[s1.charAt(i)-'a']++;
            sA2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(sA1,sA2)){
            return true;
        }
        for(int i=n1;i<n2;i++){
            sA2[s2.charAt(i-n1)-'a']--;
            sA2[s2.charAt(i)-'a']++;
            if(Arrays.equals(sA1,sA2)){
                 return true;
        }
        }
        return false;
        
    }
}