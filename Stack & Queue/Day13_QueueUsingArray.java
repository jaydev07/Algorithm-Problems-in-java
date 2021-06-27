
public class Day13_QueueUsingArray {
	public int first;
	public int last;
	public int queue[]=new int[4];
	
	Day13_QueueUsingArray() {
		first=-1;
		last=-1;
	}
	
	public static void main(String args[]) {
		Day13_QueueUsingArray c=new Day13_QueueUsingArray();
		
		c.enqueue(3);
		c.enqueue(5);
		c.enqueue(7);
		c.enqueue(9);
		System.out.println(c.dequeue());
		System.out.println(c.dequeue());
		System.out.println(c.dequeue());
		System.out.println(c.dequeue());
		c.enqueue(11);
		System.out.println(c.dequeue());
	}
	
	public void enqueue(int a) {
		if(last==queue.length-1) {
			System.out.println("Queue is Full");
		}
		if(first==-1) {
			first++;
		}
		queue[++last]=a;
	}
	
	public int dequeue() {
		if(first==-1) {
			return -1;
		}
		else if(first==last) {
			int r=queue[first];
			first=-1;
			last=-1;
			return r;
		}
		return queue[first++];
	}
}
