/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
    struct ListNode* pre = NULL;
    
    while(head)
    {
        struct ListNode* temp = head->next;
        head->next = pre;
        pre = head;
        head = temp;
    }
    return pre;

    
    
}