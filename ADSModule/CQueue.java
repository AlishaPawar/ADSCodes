class CQueue{
	int size = 5;
	int queue[] = new int[size];
	int front;
	int rear;

	CQueue(){
		front = -1;
		rear = -1;
	}

	boolean isEmpty(){
		if(front == -1 && rear == -1)
			return true;
		return false;
	}

	boolean isFull(){
		if(front == 0 && rear == size - 1)
			return true;
		return false;
	}

	void enQueue(int x){
		if(isFull()){
			System.out.println("Queue is full");
		}
		else{
			if(front == -1)
				front = 0;
			rear = (rear + 1)%size;
			queue[rear] = x;
			System.out.println(x+" inserted");
		}
	}

	int deQueue(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			return -1;
		}
		else{
			int x = queue[front];
			if(front == rear){
				front = -1;
				rear = -1;
			}
			else
				front = (front + 1) % size;
			System.out.println("Deleted element");
			return x;	
		}
	}

	void display(){
		for(int i = front ; i != rear; i = (i + 1) % size){
			System.out.println(queue[i]+" ");
		}
	}

	public static void main(String args[]){
		CQueue q1 = new CQueue();
		q1.enQueue(11);
		q1.enQueue(12);
		q1.enQueue(13);
		q1.enQueue(14);
		q1.enQueue(15);
	
		q1.enQueue(16);
		q1.display();
		q1.deQueue();
		q1.display();
		q1.enQueue(16);
		q1.display();
	}

}