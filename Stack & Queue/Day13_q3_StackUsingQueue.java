import java.util.*;
import java.util.LinkedList;
public class Day13_ques3_StackUsingQueue {
	Queue<Integer> q1;
    Queue<Integer> q2;
    /** Initialize your data structure here. */
    public Day13_ques3_StackUsingQueue() {
        q1=new LinkedList<Integer>();
        q2=new LinkedList<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q2.add(x);
        while(q1.size()!=0){
            q2.add(q1.remove());
        }
        while(q2.size()!=0){
            q1.add(q2.remove());
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(empty()){
            return -1;
        }
        return q1.remove();
    }
    
    /** Get the top element. */
    public int top() {
        return q1.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(q1.size()==0){
            return true;
        }
        return false;
    }
}
