import java.util.*;
public class Day13_q4_QueueUsingStack {
	Stack<Integer> s1;
    Stack<Integer> s2;
    
    /** Initialize your data structure here. */
    public Day13_q4_QueueUsingStack() {
        s1=new Stack<Integer>();
        s2=new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        while(s1.size()!=0){
            s2.push(s1.pop());
        }
        s2.push(x);
        while(s2.size()!=0){
            s1.push(s2.pop());
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(empty()){
            return -1;
        }
        return s1.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        if(empty()){
            return -1;
        }
        return s1.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(s1.size()==0){
            return true;
        }
        return false;
    }
}
