package b_4_12;
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while(headA!=null){
            ListNode node=headB;
            while(node!=null){
                if(node==headA)return headA;
                node=node.next;
            }
            headA=headA.next;
        }
        return null;
    }
    }
}
