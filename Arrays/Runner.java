
public class Runner {
	public static void main(String args[]) {
		LinkedList l = new LinkedList();
		
		l.insert(5);
		l.insert(7);
		l.insert(9);
		l.insert(13);
		l.show();
		
		l.insertAt(2, 8);
		l.show();
		
		l.append(3);
		l.show();
		
		l.deleteAt(3);
		l.show();
	}
}
