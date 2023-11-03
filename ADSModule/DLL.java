class DLL
{
	static Node head;

	static class Node
	{
		int data;
		Node next, prev;

		Node(int d){
			this.data = d;
			this.next = null;
			this.prev = null;
		}
	}

	void insert(int newData)
	{
		Node newNode = new Node(newData);
		newNode.next = head;
		newNode.prev = null;

		if(head != null){
			head.prev = newNode;
		}
		head = newNode;
	}

	void display()
	{
		Node n = head;
		Node p = null;

		System.out.println("Forward Direction : ");
		while(n != null){
			System.out.print(n.data+" --> ");
			p = n;
			n = n.next;
		}
		System.out.println();
		System.out.println("----------------------------");
		
		System.out.println("Backward Direction : ");
		while(p != null){
			System.out.print(p.data+" --> ");
			p = p.prev;
		}
	}
	
	void append(int newData){
		Node newNode = new Node(newData);
		newNode.next = null;
		Node last = head;
	
		if(head == null){
			newNode.prev = null;
			head = newNode;
			return;
		}
		while(last.next != null){
			last = last.next;
		}
		last.next = newNode;
		newNode.prev = last;
	}

	void insertAfter(Node prevNode, int newData){
		if(prevNode == null){
			return;
		}
		Node newNode = new Node(newData);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
		newNode.prev = prevNode;

		if(newNode.next != null){
			newNode.next.prev = newNode;
		}
	}

	void deleteNode(Node n){
		if(head == null || n == null){
			return;
		}
		if(head == n){
			head = n.next;
		}
		if(n.next != null){
			n.next.prev = n.prev;
		}
		if(n.prev != null){
			n.prev.next = n.next;
		}
		return;
	}

	public static void main(String args[])
	{
		DLL d1 = new DLL();

		//d1.display();
		System.out.println("----------------------------");
		
		d1.insert(15);
		d1.insert(10);
		d1.insert(5);
		//d1.display();

		System.out.println("---------------------------");

		d1.append(20);
		//d1.display();

		d1.append(30);
		//d1.display();

		d1.insertAfter(d1.head.next, 40);
		d1.display();

		d1.deleteNode(d1.head.next.next);
		d1.display();
	}
}