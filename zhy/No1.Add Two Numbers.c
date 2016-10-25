/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 * T=O(n)
 */


struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    if (l1 == NULL) return l2 ; 
    else if (l2 == NULL) return l1 ;
    struct ListNode *l3 = (struct ListNode *)malloc(sizeof(struct ListNode));
    l3->val=0;
    l3->next=NULL;
    struct ListNode* head = l3;
    l3->val=l1->val+l2->val;
    l1=l1->next;
    l2=l2->next;
    while(l1||l2||l3->val>9){
        l3->next=(struct ListNode *)malloc(sizeof(struct ListNode));
        l3->next->val=0;
        l3->next->next=NULL;
        if(l1){
            l3->next->val+=l1->val;
            l1=l1->next;
        }
        if(l2){
            l3->next->val+=l2->val;
            l2=l2->next;
        }
        if(l3->val>9){
            l3->next->val+=l3->val/10;
            l3->val=l3->val%10;
        }
        l3=l3->next;
    }
    return head;
}
