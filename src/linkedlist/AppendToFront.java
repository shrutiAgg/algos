package linkedlist;


public class AppendToFront {
	
	private Node head;
	private int length;
	
	public void insertAtHead(int data) {
		 Node newNode = new Node(data);
		 newNode.setNextNode(this.head);
		 this.head = newNode;
	}
	
	public void appendLastToFront(int n ) {
		
		Node prevHead = this.head;
		Node curr = this.head;
		Node last = null;
		int len = 0;
		if(n==0 || n > length) {
			return;
		}
		while(len!= length-n) {
			last = curr;
			curr = curr.getNextNode();
			len++;
		}
		if(len > 0) {
		last.setNextNode(null);
		this.head = curr;
		while(curr.getNextNode()!=null) {
			curr = curr.getNextNode();
		}
		curr.setNextNode(prevHead);
		}
		else return;
		
	}
	
	@Override
	public String toString() {
		String result ="{";
		Node current = this.head;
		while(current!=null) {
			result+= current.getData()+",";
			current = current.getNextNode();
			length++;
		}
		result+="}";
		return result;
	}
	
	public static void main(String[] args) {
		AppendToFront obj = new AppendToFront();
		obj.insertAtHead(12);
		obj.insertAtHead(1);
		obj.insertAtHead(2);
		obj.insertAtHead(14);
		System.out.println(obj);
		obj.appendLastToFront(3);
		System.out.println(obj);
	}
    
}
