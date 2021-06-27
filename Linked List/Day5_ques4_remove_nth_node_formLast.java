
public class Day5_ques4_remove_nth_node_formLast {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        // S1:- Basic approach by traversing
//         int length=0,count,index;
//         ListNode node=head;
//         while(node!=null){
//             node=node.next;
//             length++;
//         }
//         index=length-n;
//         if(index==0){
//             if(head.next==null){
//                 return null;
//             }
//             else{
//                 head=head.next;
//                 return head;
//             }
//         }
//         node=head;
//         count=0;
//         while(count!=index-1){
//             node=node.next;
//             count++;
//         }
//         ListNode current=new ListNode();
//         current=node.next;
//         node.next=current.next;
//         current.next=null;
        
//         return head;
        
        // S2:- Using fast & slow pointers
        int count=0;
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode s=dummy;
        ListNode f=dummy;
        while(count!=n){
            f=f.next;
            count++;
        }
        while(f.next!=null){
            f=f.next;
            s=s.next;
        }
        s.next=s.next.next;
        return dummy.next;
    }
}
