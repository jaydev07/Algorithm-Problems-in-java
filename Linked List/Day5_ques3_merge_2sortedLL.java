
public class Day5_ques3_merge_2sortedLL {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null && l2==null){
            return null;
        }
        else if(l1==null){
            return l2;
        }
        else if(l2==null){
            return l1;
        }
        
        // S1:- Using merge sort logic
//         ListNode i=l1;
//         ListNode j=l2;
//         ListNode head=new ListNode();
//         if(i.val<j.val){
//             head.val=i.val;
//             i=i.next;
//         }
//         else{
//             head.val=j.val;
//             j=j.next;
//         }
//         ListNode k=head;
        
//         while(i!=null && j!=null){
//             ListNode newNode=new ListNode();
//             if(i.val<j.val){
//                 newNode.val=i.val;
//                 k.next=newNode;
//                 k=newNode;
//                 i=i.next;
//             }
//             else{
//                 newNode.val=j.val;
//                 k.next=newNode;
//                 k=newNode;
//                 j=j.next;
//             }   
//         }
//         while(i!=null){
//             ListNode newNode=new ListNode();
//             newNode.val=i.val;
//             k.next=newNode;
//             k=newNode;
//             i=i.next;
//         }
//         while(j!=null){
//             ListNode newNode=new ListNode();
//             newNode.val=j.val;
//             k.next=newNode;
//             k=newNode;
//             j=j.next;
//         }
        
//         return head;
        
        // Sol2:- Using O(1) space complexity with merge sort logic
        ListNode i=l1;
        ListNode j=l2;
        ListNode prev=new ListNode();
        if(i.val<j.val){
            prev=i;
            i=i.next;
        }else{
            prev=j;
            j=j.next;
        }
        ListNode head=prev;
        
        while(i!=null && j!=null){
            if(i.val<j.val){
                prev.next=i;
                prev=i;
                i=i.next;
            }
            else{
                prev.next=j;
                prev=j;
                j=j.next;
            }
        }
        while(i!=null){
            prev.next=i;
            prev=i;
            i=i.next;
        }
        while(j!=null){
            prev.next=j;
            prev=j;
            j=j.next;
        }
        
        return head;
    }
}
