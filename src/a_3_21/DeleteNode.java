package a_3_21;

/**
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
 */
public class DeleteNode {
    public void deleteNode(ListNode head,ListNode node) {
        while(head.next!=null){
            if(head.next.val==node.val){
                ListNode temp=head.next.next;
                head.next=temp;
            }
        }
//        return head;
    }
}
