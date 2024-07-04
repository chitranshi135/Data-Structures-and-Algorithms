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
    public ListNode mergeNodes(ListNode head) {
        head = head.next;
        ListNode curr = head;
        ListNode f = head;
        int s = 0;
        while(curr != null)
        {
            if(curr.val != 0)
            {
                s += curr.val; 
            }
            else
            {
                f.val = s;
                s = 0;
                f.next = curr.next;
                f = f.next;
            }
            curr = curr.next;
        }
        return head;
    }
}