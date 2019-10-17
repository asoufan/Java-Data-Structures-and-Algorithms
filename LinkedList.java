package test;

public class LinkedList<t> {
	
	Node head;
	int numNodes=0;

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.insertHead(2);
		list.insertTail(6);
		list.insertHead(4);
		list.insertHead(5);
		list.addIndex(2, 10);
		list.deleteIndex(3);
		list.printList();

	}
	
	public void insertHead(t data) {
		
		Node temp = head;
		head = new Node(data);
		head.next = temp;
		numNodes++;
		
	}
	
	public void insertTail(t data) {
		Node temp = head;
		while(temp.next != null) {
			temp= temp.next;
		}
		Node tail = new Node(data);
		temp.next = tail;
	}
	
	public void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public void addIndex(int index, t data) {
		Node temp = head;
		for(int n =1; n < index-1 && temp.next!= null ; n++ ) {
			temp= temp.next;
		}
		Node node = new Node(data);
		Node holder = temp.next;
		temp.next = node;
		node.next = holder;
	}
	
	public void deleteIndex(int index) {
		Node temp = head;
		for(int n =1; n < index-1 && temp.next!= null ; n++ ) {
			temp= temp.next;
		}
		temp.next = temp.next.next;
	}
	
	public class Node
	{
		private t data;
		private Node next;
		
		public Node(t data) 
		{
			this.data= data;
			next = null;
		}
		
	}

}
