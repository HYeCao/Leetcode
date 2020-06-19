package b_4_7;
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if(head==null)return null;
        ListNode res=new ListNode(head.val);
        while(head.next!=null){
            head=head.next;
            ListNode node=new ListNode(head.val);
            node.next=res;
            res=node;
        }
        return res;
    }
}
