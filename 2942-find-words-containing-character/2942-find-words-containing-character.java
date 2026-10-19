class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int n=words.length;
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<n;i++ ){
            String str=words[i];
            int strlen=str.length();
            for(int j=0;j<strlen;j++){
                if(x==str.charAt(j)){
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
        
    }
}