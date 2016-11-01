/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = new ListNode(0);
        ListNode head = p;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            ListNode cur = new ListNode(0);
            int sum = ((l1 != null)? l1.val:0) + ((l2 != null)? l2.val:0) + carry;
            cur.val = sum % 10;
            carry = sum / 10;
            p.next = cur;
            p = cur;
            l1 = ((l1 == null)? l1:l1.next);
            l2 = ((l2 == null)? l2:l2.next);
        }
        return head.next;
        
        
        
        
    }
}