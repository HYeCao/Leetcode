package b_4_12;

import java.util.Stack;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str="abbaca";
        removeDuplicates(str);
    }
    public static String removeDuplicates(String S) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<S.length();i++){
                if (stack.size()!=0&&stack.peek() == S.charAt(i)) stack.pop();
                else{
                    System.out.println(S.charAt(i));
                    stack.push(S.charAt(i));
                }
            }
        System.out.println(stack.size());
        String res=new String();
        while(stack.size()!=0){
            res=stack.pop()+res;
            System.out.println(" "+res);//多加输出就会占用时间
        }
        return res;
    }
}
