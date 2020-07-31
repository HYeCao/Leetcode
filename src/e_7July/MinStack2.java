package e_7July;

import java.util.Stack;

public class MinStack2 {
    Stack<Integer> stack;
    Stack<Integer> min;
    public MinStack2() {
        stack = new Stack<>();
        min  = new Stack<>();
    }

    public void push(int x) {
        stack.add(x);
        if(min.size()==0||min.peek() >= x)min.add(x);

    }

    public void pop() {
        if(stack.peek().equals(min.peek())){//注意这个地方值的比对，不能直接 ==
            min.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return min.peek();
    }
}
