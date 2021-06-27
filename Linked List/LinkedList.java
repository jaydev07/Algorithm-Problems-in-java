
public class LinkedList{
	Node head;
	int length=0;
	
	// To show the linked list
	public void show() {
		if(head == null) {
			System.out.println("Linkedlist is empty");
		}else {
			Node n=head;
			System.out.println("\nLinkedList is: ");
			while(n!=null) {
				System.out.printf(" %d",n.data);
				n=n.next;
			}
		}
	}
	
	// To insert at last
	public void insert(int data){
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(head == null){
			head = node;
		}else{
			Node temp= head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next=node;
			length++;
		}
	}
	
	public void insertAt(int index,int data) {
		// Creating the new node
		Node newNode = new Node();
		newNode.data=data;
		newNode.next=null;
		
		if(index==length) {
			insert(data);
			return;
		}
		if(index>length) {
			System.out.println("\nIndex is greater then length of linked list!");
			return;
		}else if(index==0) {
			newNode.next=head;
			head=newNode;
			return;
		}
		
		Node n=head;
		int count=0;
		while(count!=index-1) {
			n=n.next;
			count++;
		}
		newNode.next=n.next;
		n.next=newNode;
		length++;
	}
	
	public void append(int data) {
		Node newNode = new Node();
		newNode.data=data;
		newNode.next=null;
		
		if(head==null) {
			head=newNode;
			return;
		}
		
		newNode.next=head;
		head=newNode;
		length++;
	}
	
	public void deleteAt(int index) {
		if(length==0) {
			System.out.println("\nLiskedList is empty");
			return;
		}
		else if(index>=length) {
			System.out.println("\nIndex is out of bound");
			return;
		}
		else if(index==0) {
			Node current=head;
			head=head.next;
			current.next=null;
			length--;
			return;
		}
		
		int count=0;
		Node prev=head;
		while(count!=index-1) {
			prev=prev.next;
			count++;
		}
		Node current=prev.next;
		prev.next=current.next;
		current.next=null;
		length--;
	}
}