public class DynamicStack {
    Node top;
    int size;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
			this.next = null;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int item) {
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.data;
    }

	public void display(){
		if(top == null){
			System.out.println("Stack Underflow!!");
			return;
		}
		else{
			Node newNode = top;
			while(newNode != null){
				System.out.println(newNode.data);
				newNode = newNode.next;

				if(newNode != null)
					System.out.print(" --> ");
			}
		}
	}

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        DynamicStack stack = new DynamicStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

		System.out.println("Original Stack : ");
		stack.display();

        System.out.println("Stack size: " + stack.size());

        stack.push(4); 

		System.out.println("Stack after adding element : ");
		stack.display();

        System.out.println("Stack size after expansion: " + stack.size());

        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());

		System.out.println("Stack after deleting elements : ");
		stack.display();

        System.out.println("Stack size after pops: " + stack.size());
    }
}
