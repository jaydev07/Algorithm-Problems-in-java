
public class Day12_q1_StackUsingArray {
	int top;
	int arr[] = new int[1000];

	Day12_q1_StackUsingArray()
	{
		top = -1;
	}
	
	//Function to push an integer into the stack.
    void push(int a)
	{
	    // Your code here
	    if(top==1000){
	        System.out.println("Stack is full");
	        return;
	    }
	    top++;
	    arr[top]=a;
	    
	} 
	
    //Function to remove an item from top of the stack.
	int pop()
	{
        // Your code here
        if(top==-1){
            return -1;
        }
        int removed=arr[top];
        top--;
        return removed;
	}
}
