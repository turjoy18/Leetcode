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
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode curr = head;
        int count = 0;
        while (curr != null) {
            curr = curr.next;
            count++;
        }
        
        ListNode leftK = head;
        for (int i = 1; i < k; i++)
            leftK = leftK.next;
        
        ListNode rightK = head;
        for (int i = 1; i < count - k + 1; i++)
            rightK = rightK.next;
        
        int temp = leftK.val;
        leftK.val  = rightK.val;
        rightK.val = temp;
        
        return head;
        
    }
}