package f_8August;
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

/**
 * 指针A：a+c+b
 * 指针B ：b+c+a
 * 明显 a+c+b = b+c+a，因而如果两个链表相交，则指针A和指针B必定在相交结点相遇
 */
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
}
