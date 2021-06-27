
public class Day5_ques6 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0,addition,rem=0;
        ListNode prev=new ListNode();
        ListNode head=l1;
        
        // First traverse through both the lists when they both have elements 
        while(l1!=null && l2!=null){
            addition=l1.val+l2.val+carry;
            // If addition is >0 we just add the remiander in the list & take carry=1
            if(addition>=10){
                rem=addition-10;
                carry=1;
                l1.val=rem;
            }
            // In this case we have to take carry=0
            else{
                l1.val=addition;
                carry=0;
            }
            // We have taken a "previous" to change the lists is 2 lists are of different lengths
            prev=l1;
            l1=l1.next;
            l2=l2.next;
        }
        // If l1List > l2List
        while(l1!=null){
            addition=l1.val+carry;
            if(addition>=10){
                rem=addition-10;
                carry=1;
                l1.val=rem;
            }
            else{
                l1.val=addition;
                carry=0;
            }
            prev=l1;
            l1=l1.next;
        }
        // Here we have to change the last pointer to change the list if l2.length>l1.length
        prev.next=l2;
        while(l2!=null){
            addition=l2.val+carry;
            if(addition>=10){
                rem=addition-10;
                carry=1;
                l2.val=rem;
            }
            else{
                l2.val=addition;
                carry=0;
            }
            prev=l2;
            l2=l2.next;
        }
        // At the end if we are having a carry=1 then we haveto create a new last node
        if(carry==1){
            ListNode last=new ListNode();
            last.val=1;
            last.next=null;
            prev.next=last;
        }
        
        return head;  
    }
}
