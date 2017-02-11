/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        int len = 1;
        ListNode start = head;
        while(start.next!=null){
            start = start.next;
            len++;
        }
        start.next = head;
        for(int i = 1; i<len-k%len;i++){
            head = head.next;
        }
        ListNode newhead = head.next;
        head.next = null;
        return newhead;
        
        
        
    }
}