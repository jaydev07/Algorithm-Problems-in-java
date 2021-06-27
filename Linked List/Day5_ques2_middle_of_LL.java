
public class Day5_ques2_middle_of_LL {
	public ListNode middleNode(ListNode head) {
        // S1:- basic approach
        // int length=0, midIndex, count;
        // ListNode n=head;
        // while(n!=null){
        //     n=n.next;
        //     length++;
        // }
        // midIndex=length/2;
        // n=head;
        // count=0;
        // while(count!=midIndex){
        //     n=n.next;
        //     count++;
        // }
        // return n;
        
        // S2:- Toroutise Method
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        return slow;
    }
}
