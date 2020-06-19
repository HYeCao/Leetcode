package a_3_25;

import java.util.Stack;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class ReversePrint {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> list=new Stack<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        int[] res=new int[list.size()];
        for(int i=0;i<res.length;i++){//此处不是小于 list,size 请注意
            res[i]=list.pop();
        }
        System.out.println();
        return res;
    }
}
