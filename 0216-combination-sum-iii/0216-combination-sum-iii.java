// class Solution {
//     List<List<Integer>>ans=new ArrayList<>();
//     public List<List<Integer>> combinationSum3(int k, int n) {
//         int[] arr=new int[9];
//         int j=1;
//         for(int i=0;i<9;i++){
//             arr[i]=j++;;
//         }
//         ArrayList<Integer>temp=new ArrayList<>();
//         comb(arr,k,n,temp,0,0);
//         return ans;
//     }
//     public void comb(int[] arr,int k,int tar,ArrayList<Integer>temp,int idx,int sum){
//         if(temp.size()==k && sum==tar){
//             ans.add(new ArrayList<>(temp));
//             return ;
//         }
//         if(idx==9 || sum>tar){
//             return;
//         }
//         temp.add(arr[idx]);
//         comb(arr,k,tar,temp,idx+1,sum+arr[idx]);
//         temp.remove(temp.size()-1);
//         comb(arr,k,tar,temp,idx+1,sum);
        
//     }
// }




class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        comb(k, n, 1, new ArrayList<>());
        return ans;
    }

    public void comb(int k, int target, int start, ArrayList<Integer> temp) {

        if (temp.size() == k) {
            if (target == 0) {
                ans.add(new ArrayList<>(temp));
            }
            return;
        }

        for (int i = start; i <= 9; i++) {

            // Pruning: remaining numbers cannot be negative
            if (i > target) {
                break;
            }

            temp.add(i);

            comb(k, target - i, i + 1, temp);

            temp.remove(temp.size() - 1);
        }
    }
}
