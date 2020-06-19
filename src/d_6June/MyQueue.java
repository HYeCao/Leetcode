package d_6June;

import java.util.Stack;

/**
 * 使用栈实现队列的下列操作：
 * 	push(x) -- 将一个元素放入队列的尾部。
 * 	pop() -- 从队列首部移除元素。
 * 	peek() -- 返回队列首部的元素。
 * 	empty() -- 返回队列是否为空。
 */
public class MyQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    /** Initialize your data structure here. */
    public MyQueue() {
        stack1=new Stack<>();//用于存放所有元素
        stack2=new Stack<>();//用于存放顶层元素
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
            stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
       return stack2.pop();
    }
    /** Get the front element. */
    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
      return stack2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty()&&stack2.isEmpty();
    }
}
