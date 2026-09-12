// class Solution {
//     static ArrayList<String>ans;
//     public List<String> validStrings(int n) {
//         ans=new ArrayList<>();
//         String temp="";
//         gen(n,0,temp);
//         return ans;
        
//     }
//     public void gen(int n,int idx,String temp){
//         if(idx==n){
//             if(!ans.contains(temp)){
//             ans.add(temp);
//             }
//             return;
//         }
//         if(temp.length()!=0 && (temp.charAt(temp.length()-1)=='0')){
//             gen(n,idx+1,temp+"1");
//         }else{
//             gen(n,idx+1,temp+"0");

//         }
//         gen(n,idx+1,temp+"1");
//     }
// }

class Solution {
    static ArrayList<String> ans;

    public List<String> validStrings(int n) {
        ans = new ArrayList<>();

        StringBuilder temp = new StringBuilder();

        gen(n, 0, temp);

        return ans;
    }

    public void gen(int n, int idx, StringBuilder temp) {

        // Base case
        if (idx == n) {
            ans.add(temp.toString());
            return;
        }

        // Add 0 only if previous character is not 0
        if (idx == 0 || temp.charAt(idx - 1) != '0') {

            temp.append('0');
            gen(n, idx + 1, temp);
            temp.deleteCharAt(temp.length() - 1);
        }

        // Add 1
        temp.append('1');
        gen(n, idx + 1, temp);
        temp.deleteCharAt(temp.length() - 1);
    }
}