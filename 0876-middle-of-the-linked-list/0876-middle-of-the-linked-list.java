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
    public ListNode middleNode(ListNode head) {
        // int n = 0;
        // ListNode curr = head;
        // while(curr != null)
        // {
        //     n++;
        //     curr = curr.next;
        // }
        // int mid = n/2, i = 0;
        // curr = head;
        // while(curr != null)
        // {
        //     if(i == mid)
        //         return curr;
        //     i++;
        //     curr = curr.next;
        // }
        // return null;
        ListNode i = head;
        ListNode j = head;
        while(j != null && j.next != null)
        {
            i = i.next;
            j = j.next.next;
        }
        return i;
    }
}