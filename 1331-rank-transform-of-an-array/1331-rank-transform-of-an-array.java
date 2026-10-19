class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        int[] ans=new int[n];
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);
        HashMap<Integer,Integer>map=new HashMap<>();
        int rank=1;
        for(int num:arr){
            if(!map.containsKey(num)){
                map.put(num,rank++);
            }
        }
        for(int i=0;i<n;i++){
            ans[i]=map.get(copy[i]);
        }
        return ans;
        
    }
}