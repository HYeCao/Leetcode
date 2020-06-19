package b_4_5;


class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}

/**
 * 快慢指针使用问题
 */
public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
