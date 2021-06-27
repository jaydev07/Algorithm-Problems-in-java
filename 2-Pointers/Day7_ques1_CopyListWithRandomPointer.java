
public class Day7_ques1_CopyListWithRandomPointer {
	public NodeNew copyRandomList(NodeNew head) {
        if(head==null){
            return null;
        }
        NodeNew n=head;
        // Placing the duplictes behind the original's back
        while(n!=null){
            NodeNew duplicate=new NodeNew(n.val);
            duplicate.next=n.next;
            n.next=duplicate;
            n=n.next.next;
        }
        
        n=head;
        // Locating random pointers of the duplicate nodes
        while(n!=null){
            // System.out.printf("%d ",n.val);
            if(n.random==null){
                n.next.random=null;
            }else{
                n.next.random=n.random.next;   
            }
            n=n.next.next;
        }
        
        NodeNew newHead=head.next;
        NodeNew t1=head;
        NodeNew t2=t1.next.next;
        while(t2!=null){
            t1.next.next=t2.next;
            t1.next=t2;
            t1=t2;
            t2=t2.next.next;
        }
        t1.next=null;
        return newHead;
    }
}
