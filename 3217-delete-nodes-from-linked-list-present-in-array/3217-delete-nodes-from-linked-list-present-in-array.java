/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.HashSet;
import java.util.Set;

class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        ListNode list = new ListNode(0);
        ListNode temp2 = list;
        ListNode temp = head;
        while (temp != null) {
            if (!set.contains(temp.val)) {  
                temp2.next = new ListNode(temp.val);
                temp2 = temp2.next;
            }
            temp = temp.next;
        }


        return list.next; 
    }
}
