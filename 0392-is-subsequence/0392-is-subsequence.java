class Solution {
    public boolean isSubsequence(String s, String t) {
        // HashSet<Character>set1=new HashSet<>();
        // HashSet<Character>set2=new HashSet<>();
        // char[] chars = s.toCharArray();
        // char[] charT = t.toCharArray();
        // for(char c:charT){
        //     set2.add(c);
        // }
        // for(char c:chars){
        //     if(!set2.contains(c)){
        //         return false;
        //     }
        // }
        // return true;
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
               }
            j++;
        }

        return i == s.length();
        
    }
}