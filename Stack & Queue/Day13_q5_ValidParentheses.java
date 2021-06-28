import java.util.*;
public class Day13_q5_ValidParentheses {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s;
		boolean ans=true;
		Stack<Character> stack=new Stack<Character>();
		System.out.println("Enter the input string:");
		s=sc.nextLine();
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') {
				stack.push(s.charAt(i));
			}
			else if(s.charAt(i)==')') {
				while(stack.size()>0 && stack.peek()!='(') {
					stack.pop();
				}
				if(stack.size()==0) {
					ans=false;
					break;
				}
				stack.pop();
			}
			else if(s.charAt(i)==']') {
				while(stack.size()>0 && stack.peek()!='[') {
					stack.pop();
				}
				if(stack.size()==0) {
					ans=false;
					break;
				}
				stack.pop();
			}
			else if(s.charAt(i)=='}') {
				while(stack.size()>0 && stack.peek()!='{') {
					stack.pop();
				}
				if(stack.size()==0) {
					ans=false;
					break;
				}
				stack.pop();
			}
		}
		
		if(ans && stack.size()==0) {
			System.out.println("Entered String is Valid");
		}
		else{
			System.out.println("Entered String is Invalid");
		}
	}
}
