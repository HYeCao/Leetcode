package f_8August;

import java.util.Stack;

public class MinStack {
    /** initialize your data structure here. */
    Stack<Integer> stack;
    Stack<Integer> min;
    public MinStack() {
        stack = new Stack<>();
        min = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (min.isEmpty() || x <= min.peek())
            min.push(x);
    }
    public void pop() {
        if(stack.peek().equals(min.peek())){//注意此处的值的比较，对象的比较不是数据类型的比较
            stack.pop();
            min.pop();
        }
        else {
            stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
