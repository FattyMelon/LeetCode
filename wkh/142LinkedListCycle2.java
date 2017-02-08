/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode cur = head;
        if(head==null) return null;
        int count = 0;
        while(fast.next!=null&&fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                while(slow!=cur){
                    slow = slow.next;
                    cur = cur.next;
                }
                return cur;
            }
        }
        return null;
}
}