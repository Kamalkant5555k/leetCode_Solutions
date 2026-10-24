// class Solution {
//     public String removeDuplicates(String s, int k) {
//         Stack<Character>st=new Stack<>();
//         Stack<Integer>count=new Stack<>();
//         for(char ch:s.toCharArray()){
//             if(!st.empty() && st.peek()==ch){
//                 count.push(count.pop()+1);
//             }else{
//                 st.push(ch);
//                 count.push(1);
//             }
//             if(count.peek()==k){
//                 count.pop();
//                 st.pop();
//             }
//         }
//     StringBuilder sb = new StringBuilder();

// for (char ch : st) {
//     sb.append(ch);
// }

// return sb.toString();
        
//     }
// }


import java.util.*;

class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> st = new Stack<>();
        Stack<Integer> count = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!st.empty() && st.peek() == ch) {
                int c = count.pop() + 1;
                st.push(ch);
                count.push(c);
            } else {
                st.push(ch);
                count.push(1);
            }
            if (count.peek() == k) {
                for (int i = 0; i < k; i++) {
                    st.pop();
                }
                count.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : st) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
