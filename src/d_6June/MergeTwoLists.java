package d_6June;

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res;
        if(l1==null&&l2==null)return null;
        if(l1==null&&l2!=null)return l2;
        if(l2==null&&l1!=null)return l1;
        if(l1.val>l2.val){
             res=l2;
             l2=l2.next;
        }
        else {
             res = l1;
             l1=l1.next;
        }
        ListNode end=res;
        while(l1!=null&&l2!=null){
            if(l1.val>l2.val){
                res.next=l2;
                res=res.next;
                l2=l2.next;
            }
            else {
                res.next=l1;
                res=res.next;
                l1=l1.next;
            }
        }
        if(l1!=null)res.next=l1;
        else if(l2!=null)res.next=l2;
        return end;
    }
}
