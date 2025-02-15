/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;
        int lenA = 0, lenB = 0;

        while (a != null) {
            lenA++;
            a = a.next;
        }

        while (b != null) {
            lenB++;
            b = b.next;
        }

        a = headA;
        b = headB;

        if (lenA > lenB) {
            for (int i = 0; i < lenA - lenB; i++) {
                a = a.next;
            }
        } else {
            for (int i = 0; i < lenB - lenA; i++) {
                b = b.next;
            }
        }

        while (a != null & b != null) {
            if (a == b) return a;
            a = a.next;
            b = b.next;
        }

        return null;
    }
}