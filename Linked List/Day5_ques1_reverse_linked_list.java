
public class Day5_ques1_reverse_linked_list {
	public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        else if(head.next==null){
            return head;
        }
        ListNode prev=head;
        ListNode current=prev.next;
        ListNode ahead=current.next;
        prev.next=null;
        
        while(current.next!=null){
            current.next=prev;
            prev=current;
            current=ahead;
            ahead=ahead.next;
        }
        
        current.next=prev;
        head=current;
        return head;
    }
}
