/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        return partion(lists, 0, lists.length-1);
    }
    
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
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
    public static ListNode partion(ListNode[] lists, int i, int j){
        if (i==j) return lists[i];
        if (i<j){
            int mid = (i+j)/2;
            ListNode l1 = partion(lists,i,mid);
            ListNode l2 = partion(lists,mid+1,j);
            return mergeTwoLists(l1,l2);
        }
        else{
            return null;
        }
    }
}