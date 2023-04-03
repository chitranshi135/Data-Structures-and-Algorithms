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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null && n == 1)
            return null;
        int i = 1;
        ListNode slow = head, fast = head, prev = null;
        while(i <= n)
        {
            if(fast == null)
                return head;
            fast = fast.next;
            i++;
        }
        //System.out.println(fast);
        while(fast != null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        //System.out.println(prev.val);
        if(prev != null)
            prev.next = slow.next;
        else
            head = slow.next;
        slow.next = null;
        return head;
    }
}