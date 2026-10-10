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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null){
            
             return null;}
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        while (l1 != null) {
            a1.add(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            a2.add(l2.val);
            l2 = l2.next;
        }
        int i = a1.size() - 1;
        int j = a2.size() - 1;
        int carry = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;

            if (i >= 0) {
            sum += a1.get(i--);
               }
            if (j >= 0) {
                sum += a2.get(j--);
                }

            carry = sum / 10;
            arr.add(sum % 10);
        }
        ListNode dummy = new ListNode(-1);
        ListNode d = dummy;

        for (int k = arr.size() - 1; k >= 0; k--) {
            d.next = new ListNode(arr.get(k));
            d = d.next;
        }

        return dummy.next;
    }
}
