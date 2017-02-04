/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m == n) return head;
        if(m > 1){
            ListNode newhead = head;
            newhead.next = reverseBetween(head.next,m-1,n-1);
            return newhead;
        }
        else{
            ListNode next = head.next;
            ListNode newhead = reverseBetween(next,1,n-1);
            ListNode nextnext = next.next;
            next.next = head;
            head.next = nextnext;
            return newhead;
        }
    }
    
}


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        for(int i = 0; i<m-1; i++){
            pre = pre.next;
        }
        ListNode start = pre.next;
        ListNode then = start.next;
        for(int i = 0; i<n-m;i++){
            start.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = start.next;
        }
        return dummy.next;
        
    }
    
}