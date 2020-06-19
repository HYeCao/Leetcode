package c_5May;

import java.util.ArrayList;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}
public class RemoveDuplicateNodes {
    public ListNode removeDuplicateNodes(ListNode head) {
        if(head==null)return null;
        ArrayList<Integer> list=new ArrayList<>();
        ListNode res=new ListNode(head.val);
        ListNode end=res;
        list.add(head.val);
        while(head.next!=null){
            if(!list.contains(head.val)){
                list.add(head.val);
                ListNode node=new ListNode(head.val);
                res.next=node;
                res=res.next;
                head=head.next;
            }
            else head=head.next;
        }
        if(!list.contains(head.val)){
            list.add(head.val);
            ListNode node=new ListNode(head.val);
            res.next=node;
            res=res.next;
        }
        return end;
    }
}

/**
 * public ListNode removeDuplicateNodes(ListNode head) {
 *
 *         ListNode p = head;
 *         while (p != null) {
 *             ListNode q = p;
 *             while (q.next != null) {
 *                 if (q.next.val == p.val)
 *                     q.next = q.next.next;
 *                 else
 *                     q = q.next;
 *             }
 *             p = p.next;
 *         }
 *         return head;
 *     }
 */
