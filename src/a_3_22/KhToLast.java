package a_3_22;

import java.util.ArrayList;

/**
 * 实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。
 * 输入： 1->2->3->4->5 和 k = 2
 * 输出： 4
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class KhToLast {
    public static void main(String[] args) {

    }
    public int kthToLast(ListNode head, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        return list.get(list.size()-k);
    }
}
