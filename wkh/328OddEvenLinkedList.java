/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = head;
        if(head!=null){
            ListNode even = head.next;
            ListNode second = head.next;
            while(even!=null&&even.next!=null){
               odd.next = even.next;
               odd = even.next;
               even.next = odd.next;
               even = odd.next;
            }
            odd.next = second;
        }
        return head;
        
        
    }
}