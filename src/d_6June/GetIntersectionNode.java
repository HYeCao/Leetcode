package d_6June;
class ListNode {
     int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
}

/**
 * 思路：两个链表找公共节点
 * 上述思路较为清晰，只是代码较为复杂，可以考虑第二种方法，简化代码
 * 此解题思路参考：使用两个指针 node1，node2 分别指向两个链表 headA，headB 的头结点，然后同时分别逐结点遍历；当 node1 到达链表 headA 的末尾时，重新定位到链表 headB 的头结点；当 node2到达链表 headB的末尾时，重新定位到链表 headA的头结点。这样，当它们相遇时，所指向的结点就是第一个公共结点。
 * 上述思路可以这样理解，两链表构成的Y形结构的长度时固定的，即两个分叉部分(可能长度不一)+一个重合部分；(不存在重合节点时，则后面重合部分的长度不存在)
 * 对于node1，其先走headA对应的分叉和重合部分(若有的话)，即全部的链表A的长度，之后从headB开始，走剩下的那个分叉。
 * 对于node2,其先走headB对应的分叉和重合部分(若有的话)，即全部的链表B的长度，之后从headA开始，走剩下的那个分叉。
 * 由于Y的长度时固定的，两指针又是同时开始，步速一致，若存在重合节点，两者最终一定可以汇合。
 * 复杂度分析: 时间复杂度：O(m+n); 空间复杂度：O(1)
 */
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode node1=headA;
        ListNode node2=headB;
        while(node1!=node2){

            node1 = node1==null?headB:node1.next;
            node2 = node2==null?headA:node2.next;
        }
        return node1;

    }
}
