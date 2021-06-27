
public class Day6_ques6_FlattenLL {
	myNode flatten(myNode root)
    {
        if(root==null || root.next!=null){
            return root;
        }
        root.next=flatten(root.next);
        root=merge(root,root.next);
        return root;
    }
    
    myNode merge(myNode l1, myNode l2){
    	myNode pre=new myNode(0);
    	myNode newHead=pre;
       while(l1!=null && l2!=null){
	       if(l1.data<l2.data){
	           pre.bottom=l1;
	           pre=pre.bottom;
	           l1=l1.bottom;
	       }else{
	           pre.bottom=l2;
	           pre=pre.bottom;
	           l2=l2.bottom;
	       }
	   }
	   if(l1!=null){
	       pre.bottom=l1;
	   }
	   else{
	       pre.bottom=l2;
	   }
	   return newHead.bottom;
    }
}
