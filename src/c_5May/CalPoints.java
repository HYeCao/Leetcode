package c_5May;

import java.util.Stack;

/**
 * 栈的使用 STACK
 */
public class CalPoints {
    public static void main(String[] args) {
        System.out.println( Integer.parseInt(null));
    }
    public int calPoints(String[] ops) {
        int res=0;
        Stack<Integer> stack=new Stack<>();
        int[] tem=new int[ops.length];
        for(int i=0;i<ops.length;i++){
            if(ops[i].equals("C")){
                stack.pop();
            }
            else  if(ops[i].equals("D")){
                stack.push(stack.peek()*2);
            }
            else if(ops[i].equals("+")){
                int a=stack.pop();
                int b=stack.pop();
                stack.push(b);
                stack.push(a);
                stack.push(a+b);
            }
            else {
                stack.push(Integer.valueOf(ops[i]));
            }
        }
        while(!stack.isEmpty()){
            res+=stack.pop();
        }
        return res;
    }
}
