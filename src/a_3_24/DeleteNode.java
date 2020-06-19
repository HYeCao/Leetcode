package a_3_24;

/**
 * 实现一种算法，删除单向链表中间的某个节点（除了第一个和最后一个节点，不一定是中间节点），假定你只能访问该节点。
 * 思路：把下一个节点的值赋予该节点，从而实现替换
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class DeleteNode {
    public void deleteNode(ListNode node) {
        if(node.next.next==null){
            node.val=node.next.val;
            node.next=null;
        }
        else {
            node.val = node.next.val;
            node.next.val = node.next.next.val;
            node.next = node.next.next;
        }
    }
}
