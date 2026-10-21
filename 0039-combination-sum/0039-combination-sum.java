class Solution {
    List<List<Integer>>ans;
    public List<List<Integer>> combinationSum(int[] candi, int target) {
        ans=new ArrayList<>();
        ArrayList<Integer>temp=new ArrayList<>();
        comb(candi,target,temp,0,0);
        return ans;

        
    }
    public void comb(int[] candi,int target,ArrayList<Integer>temp,int idx,int sum){
        int n=candi.length;
     
        if(sum==target){
            ans.add(new ArrayList<>(temp));
            return ;
        }
        if(idx==n || sum>target){
            return ;
        }
        
        temp.add(candi[idx]);
        comb(candi,target,temp,idx,sum+candi[idx]);
        temp.remove(temp.size() - 1);
        comb(candi,target,temp,idx+1,sum);
    }
}