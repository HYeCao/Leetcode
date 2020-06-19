package a_3_25;

/**
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */
public class ReverseList {

    /**
     * 设定的节点 直接赋值 不可以直接套用节点 易产生错误 链表环的形成
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if(head==null)return null;
        ListNode node=new ListNode(head.val);
        while(head.next!=null){
            ListNode temp=new ListNode(head.next.val);
            temp.next=node;
            node=temp;
            head=head.next;
        }
        return node;
    }
}
