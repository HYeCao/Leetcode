package a_3_26;

import java.util.ArrayList;
import java.util.Collections;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}
/**
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 * 示例1：
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null&&l2==null)return null;
        ArrayList<Integer> list=new ArrayList<>();
        while(l1!=null){
            list.add(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            list.add(l2.val);
            l2=l2.next;
        }
        Collections.sort(list);
        ListNode head=new ListNode(list.get(0));
        ListNode node=head;
        for(int i=1;i< list.size();i++){
            ListNode temp=new ListNode(list.get(i));
            node.next=temp;
            node=temp;
        }
        return head;
        /** 参考答案：
         *         if(l1==null)return l2;
         *         if(l2==null)return l1;
         *         ListNode newNode;
         *         if(l1.val<l2.val){
         *             newNode = l1;
         *             newNode.next = mergeTwoLists(l1.next,l2);
         *         }else{
         *             newNode = l2;
         *             newNode.next = mergeTwoLists(l1,l2.next);
         *         }
         *
         *         return newNode;
         */
    }
}
