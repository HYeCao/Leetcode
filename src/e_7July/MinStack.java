package e_7July;

import java.util.Stack;

class MinStack {

    Stack<Integer> stack1;//存放所有元素
    Stack<Integer> stack2;//只存放最小值
    /** initialize your data structure here. */
    public MinStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
        if(stack2.isEmpty())stack2.push(x);
        else if(x <= stack2.peek()){
            stack2.push(x);
        }
        else {
            stack2.push(stack2.peek());
        }
    }

    public void pop() {
        stack2.pop();
        stack1.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int getMin() {
        return stack2.peek();
    }
}