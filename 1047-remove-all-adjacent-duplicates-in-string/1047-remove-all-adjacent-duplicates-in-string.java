class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(st.empty()){
                st.push(ch);
            }else if(st.peek()==ch){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        StringBuilder str=new StringBuilder();
        while(!st.empty()){
            str=str.append(st.pop());
        }
        str.reverse();
        String ans=str.toString();
        return ans;
        
    }
}