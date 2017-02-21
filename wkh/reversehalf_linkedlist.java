public ListNode reverseSecondhalf(ListNode head){
    ListNode fast = head;
    ListNode slow = head;
    while(fast.next!=null && fast.next.next!=null){
        fast = fast.next.next;
        slow = slow.next;
    }
    ListNode pre = slow.next; //从pre处开始reverse
    ListNode cur = pre.next;  //自始至终pre是没有动的
    while(cur!=null){
        pre.next = cur.next;
        cur.next = slow.next;
        slow.next = cur;
        cur = pre.next;
    }
    return head;
}