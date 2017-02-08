/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast!=null) {slow = slow.next;}
        slow = reverse(slow);
        fast = head;
        while(slow!=null){
            if(fast.val!=slow.val){
                return false;
            }
            else{
                fast=fast.next;
                slow=slow.next;
            }
        }
        return true;
        
    }
    
    public ListNode reverse(ListNode head){
        ListNode newhead = null;
        while(head!=null){
            ListNode next = head.next;
            head.next = newhead;
            newhead = head;
            head = next;
        }
        return newhead;
    }
}