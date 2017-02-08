/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        while(head!=null){
            if(head.val!=val){
                head = head.next;
                pre = pre.next;
            }
            else{
                pre.next = head.next;
                head = pre.next;
            }
        }
        return dummy.next;
        
    }

}

/**
 Recursion
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
        head.next = removeElements(head.next,val);
        return head.val==val? head.next:head;
        
    }
}