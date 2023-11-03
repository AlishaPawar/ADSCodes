class LinkedList
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
		while(n.next != null)
		{
			System.out.print(n.data +" ---> ");
			n = n.next;
		}
		System.out.print("null");

	}

	public static void main(String args[])
	{
		LinkedList l1 = new LinkedList();
		l1.head = new Node(5);
		Node second = new Node(7);
		Node third = new Node(9);

		l1.head.next = second;
		second.next = third;

		l1.display();
	}
}