
public class Day5_ques5_delete_node_byrefrence {
	public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
