package d_6June;


import java.util.ArrayList;

public class LastRemaining {
    //超出了时间限制，需要进行优化！！！
//    public int lastRemaining(int n, int m) {
//        ListNode nd=new ListNode(0);
//        ListNode head=nd;
//        for(int i=1;i<n;i++){
//            ListNode TEMP=new ListNode(i);
//            nd.next=TEMP;
//            nd=TEMP;
//        }
//        nd.next=head;
//        if(m==1)return nd.val;
//        while(true){
//            if(head.next==head)
//                break;
//            else {
//                for(int i=1;i<m-1;i++){
//                    head=head.next;
//                }
//                ListNode node=head.next.next;
//                head.next=node;
//                head=node;
//            }
//        }
//        return head.val;
//    }
    public int lastRemaining(int n, int m) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)list.add(i);
        int tem=0;
        while(n>1){
            tem=(tem+m-1)%n;
            list.remove(tem);
            n--;
        }
        return list.get(0);
    }
    /*
    class Solution {
    public int lastRemaining(int n, int m) {
        int ans = 0;
        // 最后一轮剩下2个人，所以从2开始反推
        for (int i = 2; i <= n; i++) {
            ans = (ans + m) % i;
        }
        return ans;
    }
}
     */
}
