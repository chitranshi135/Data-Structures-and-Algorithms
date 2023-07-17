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
        Deque<Integer> stack1 = new ArrayDeque<>();
        Deque<Integer> stack2 = new ArrayDeque<>();
        int carry = 0;
        ListNode curr = l1;
        while(curr != null)
        {
            stack1.push(curr.val);
            curr = curr.next;
        }
        curr = l2;
        while(curr != null)
        {
            stack2.push(curr.val);
            curr = curr.next;
        }
        ListNode head = null, prev = null;
        int s = 0;
        while((carry != 0) || (!stack1.isEmpty() || !stack2.isEmpty()))
        {
            ListNode temp = new ListNode();
            if(!stack1.isEmpty() && !stack2.isEmpty())
            {
                s = (carry + stack1.peek() + stack2.peek()) % 10;
                carry = (carry + stack1.pop() + stack2.pop()) / 10;
            }
            else if(!stack1.isEmpty() && stack2.isEmpty())
            {
                s = (carry + stack1.peek()) % 10;
                carry = (carry + stack1.pop()) / 10;
            }
            else if(stack1.isEmpty() && !stack2.isEmpty())
            {
                s = (carry + stack2.peek()) % 10;
                carry = (carry + stack2.pop()) / 10;
            }
            else
            {
                s = carry;
                carry = 0;
            }
            temp.val = s;
            temp.next = prev;
            prev = temp;
        }
        return prev;
    }
}