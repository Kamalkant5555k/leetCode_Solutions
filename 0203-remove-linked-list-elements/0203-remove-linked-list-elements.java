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
    public ListNode removeElements(ListNode head, int vall) {
        // if(head==null){
        //     return null;
        // }
        // if(head.val==vall){
        //     head=head.next;
        // }
        // ListNode t1=head;
        // ListNode t2=head.next;
        // while(t2!=null){
        //     if(t2.val==vall){
        //         t1.next=t2.next;
        //     }else{
        //     t1=t1.next;
        //     t2=t2.next;}
        // }
        // return head;

         ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode curr = dummy;

        while (curr.next != null) {
            if (curr.next.val == vall) {
                curr.next = curr.next.next; // delete
            } else {
                curr = curr.next; 
            }
        }
        return dummy.next;
    }
}