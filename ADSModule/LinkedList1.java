class LinkedList1
{
	Node head;

	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			this.data = d;
			this.next = null; 
		}
	}
	
	void display()
	{
		Node n = head;
		while(n != null)
		{
			System.out.print(n.data +" ---> ");
			n = n.next;
		}
		System.out.print("null");

	}
	void insert(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	public static void main(String args[])
	{
		LinkedList1 l1 = new LinkedList1();
		l1.head = new Node(5);
		Node second = new Node(7);
		Node third = new Node(9);

		l1.head.next = second;
		second.next = third;

		l1.display();
		l1.insert(3);
		System.out.println();
		l1.display();
	}
}