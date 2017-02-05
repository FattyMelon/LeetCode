/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        else if(l2==null) return l1;
        else{
            ListNode next1 = l1.next;
            ListNode next2 = l2.next;
            if(l1.val>l2.val){
                l2.next = mergeTwoLists(l1,next2);
                return l2;
            }
            else{
                l1.next = mergeTwoLists(l2,next1);
                return l1;
            }
        }
    }
}