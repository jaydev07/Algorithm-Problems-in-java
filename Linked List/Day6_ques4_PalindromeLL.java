
public class Day6_ques4_PalindromeLL {
	public boolean isPalindrome(ListNode head) {
        if(head.next==null){
            return true;
        }
        // ListNode n=head.next;
        // ListNode t2=head;
        // // ListNode h2;
        // while(n!=null){
        //     ListNode t=new ListNode();
        //     t.val=n.val;
        //     t.next=t2;
        //     t2=t;
        //     n=n.next;
        // }
        // n=head;
        // while(n!=null){
        //     if(n.val!=t2.val){
        //         return false;
        //     }
        //     n=n.next;
        //     t2=t2.next;
        // }
        // return true;
        
        ListNode slow,fast;
        slow=head;
        fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode a,b,c;
        a=slow.next;
        b=a.next;
        a.next=null;
        if(b==null){
            if(a.val==head.val){
                return true;
            }else{
                return false;
            }
        }
        if(b.next!=null){
            c=b.next;
            while(c!=null){
                b.next=a;
                a=b;
                b=c;
                c=c.next;
            }
        }
        b.next=a;
        a=b;
        
        ListNode d=head;
        while(a!=null){
            if(a.val!=d.val){
                return false;
            }
            a=a.next;
            d=d.next;
        }
        return true;
    }
}
