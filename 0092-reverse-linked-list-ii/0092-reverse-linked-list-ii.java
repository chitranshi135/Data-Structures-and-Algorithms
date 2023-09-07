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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        int c = 1;
        while(c < left)
        {
            prev = curr;
            curr = curr.next;
            c++;
        }
        ListNode L = prev;
        ListNode R = curr;
        while(c <= right)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            c++;
        }
        R.next = curr;
        if(L != null)
        {
            L.next = prev;
            return head;
        }
        return prev;
    }
}