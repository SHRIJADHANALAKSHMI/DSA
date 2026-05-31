public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null)
            return null; // return null if heada and headb become null

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        return a; // intersection node OR null will return . so heada==null or headb==null will return null.
    }
}
