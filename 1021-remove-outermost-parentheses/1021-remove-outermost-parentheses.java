class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();  
        StringBuilder ans = new StringBuilder();
        Stack<Character>st=new Stack<>();
 
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (!st.isEmpty()) {
                    ans.append(ch);
                }
                st.push(ch);
            } else {
                st.pop();
                if (!st.isEmpty()) {
                    ans.append(ch);
                }
            }
        }

       
        return ans.toString();
        
    }
}