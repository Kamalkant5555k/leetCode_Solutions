/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode t=head;
        ArrayList<Integer> arr=new ArrayList<>();
        while(t!=null){
            arr.add(t.val);
            t=t.next;
        }
        int n=arr.size();
        for(int i=0;i<n/2;i++){
            if(!arr.get(i).equals(arr.get(n-1-i))){
                return false;
            }

        }
        return true;
        
    }
}