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
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {        
        ListNode dummy = new ListNode(0, head);
        ListNode begin = dummy;
                
        while (begin != null) {
            int prefix = 0;
            ListNode finish = begin.next;

            while (finish != null){
                prefix += finish.val;
                if (prefix == 0){
                    begin.next = finish.next;
                }
                finish = finish.next;
            }
            begin = begin.next;
        }       
        return dummy.next;    
    }
}