
public class Day6_ques1_intersection_of_2LL {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // S1
//         int l1=1,l2=1,diff;
//         ListNode d1=headA;
//         ListNode d2=headB;
//         while(d1!=null && d2!=null){
//             l1++;
//             l2++;
//             d1=d1.next;
//             d2=d2.next;
//         }
//         while(d1!=null){
//             l1++;
//             d1=d1.next;
//         }
//         while(d2!=null){
//             l2++;
//             d2=d2.next;
//         }
        
//         d1=headA;
//         d2=headB;
//         if(l1>l2){
//             diff=l1-l2;
//             while(diff!=0){
//                 d1=d1.next;
//                 diff--;
//             }
//         }else if(l2>l1){
//             diff=l2-l1;
//             while(diff!=0){
//                 d2=d2.next;
//                 diff--;
//             }
//         }
        
//         while(d1!=d2){
//             d1=d1.next;
//             d2=d2.next;
//         }
        
//         return d1;
        ListNode d1=headA;
        ListNode d2=headB;
        while(d1!=d2){
            d1=d1.next;
            d2=d2.next;
            if(d1==null && d2==null){
                break;
            }
            else if(d1==null){
                d1=headB;
            }
            else if(d2==null){
                d2=headA;
            }
        }
        return d1;
    }
}
