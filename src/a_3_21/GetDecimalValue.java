package a_3_21;

/**
 * 给你一个单链表的引用结点 head。链表中每个结点的值不是 0 就是 1。已知此链表是一个整数数字的二进制表示形式。
 * 请你返回该链表所表示数字的 十进制值 。
 */
 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class GetDecimalValue {

    public static  int getDecimalValue(ListNode head) {
        String str=new String();
        while(head!=null){
            str=str+head.val;
            head=head.next;
        }
        int res=0;
        for(int i=0;i<str.length();i++){
            double temp=Double.valueOf(str.charAt(i))-48;//注意数字的转化
            double num=str.length()-i-1;
            res= (int) (res+Math.pow(2,num)*temp);
            System.out.println(temp+" "+num+" "+res);
        }
        System.out.println(res);
        return res;
    }
    }
