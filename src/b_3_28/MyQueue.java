package b_3_28;

import java.util.Stack;

/**
 * 实现一个MyQueue类，该类用两个栈来实现一个队列。
 * 示例：MyQueue queue = new MyQueue();
 * queue.push(1);
 * queue.push(2);
 * queue.peek();  // 返回 1
 * queue.pop();   // 返回 1
 * queue.empty(); // 返回 false
 *
 */
public class MyQueue {
    /** Initialize your data structure here. */
    private Stack<Integer> numStack;
    private Stack<Integer> peakStack;
    public MyQueue() {
        numStack = new Stack<>();
        peakStack =new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        numStack.push(x);
//        if(peakStack.isEmpty())peakStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        peek();
        return peakStack.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(peakStack.isEmpty()){
            while (!numStack.isEmpty()){
                peakStack.push(numStack.pop());//peek 不改变栈的值(不删除栈顶的值)，pop会把栈顶的值删除。
            }
        }
        return peakStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return peakStack.isEmpty()&&numStack.isEmpty();
    }
}
