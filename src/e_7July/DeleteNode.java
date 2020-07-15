package e_7July;

import java.util.List;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}
public class DeleteNode {
    public ListNode deleteNode(ListNode head, int val) {
        if(head.val == val) {
            head = head.next;
            return head;
        }
        ListNode node = head;
        while(node.next != null){

            if(node.next.val == val){
                node.next = node.next.next;
            }
            if(node.next == null)break;
            node = node.next;
        }
        return head;
    }
}
