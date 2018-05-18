package linkedlist;

public class ReverseList {

	
	private Node head;
	private int length;
	
	public void insertAtHead(int data) {
		 Node newNode = new Node(data);
		 newNode.setNextNode(this.head);
		 this.head = newNode;
	}
	
	public void reverse() {
		Node curr = this.head;
		Node prev = null;
		Node next;
		while(curr!=null) {
			 next = curr.getNextNode();
			 curr.setNextNode(prev); 
			 prev = curr;
			 curr =next;
		 }
		this.head = prev;
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
		ReverseList obj = new ReverseList();
		obj.insertAtHead(12);
		obj.insertAtHead(1);
		obj.insertAtHead(2);
		obj.insertAtHead(14);
		System.out.println(obj);
		obj.reverse();
		System.out.println(obj);
	}
}
