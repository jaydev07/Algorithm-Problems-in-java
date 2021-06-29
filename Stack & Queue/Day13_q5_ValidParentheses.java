import java.util.*;
public class Day13_q5_ValidParentheses {
	public boolean isValid(String s) {
        if(s.length()==0){
            return true;
        }
        else if(s.length()==1){
            return false;
        }
		Stack<Character> stack=new Stack<Character>();
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') {
				stack.push(s.charAt(i));
			}
			else if(s.charAt(i)==')') {
                if(stack.size()<=0 || stack.peek()!='('){
                    return false;
                }
				stack.pop();
			}
			else if(s.charAt(i)==']') {
				if(stack.size()<=0 || stack.peek()!='['){
                    return false;
                }
				stack.pop();
			}
			else if(s.charAt(i)=='}') {
				if(stack.size()<=0 || stack.peek()!='{'){
                    return false;
                }
				stack.pop();
			}
		}
		
		if(stack.size()==0) {
            return true;
		}
        return false;
    }
}
