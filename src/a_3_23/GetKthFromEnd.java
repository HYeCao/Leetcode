package a_3_23;

/**
 * 给定一个链表: 1->2->3->4->5, 和 k = 2.
 *
 * 返回链表 4->5.
 * 思路：双指针遍历
 */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}
public class GetKthFromEnd {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if(head.next==null)return head;
        ListNode node=head;
        for(int i=0;;i++){
            if(i==k-1){
                break;
            }
            node=node.next;//注意与上面的判别条件 位置放置的区别
        }
        while(node.next!=null){
            node=node.next;
            head=head.next;
        }
        return head;
    }
}
