class DQueue{
	int max = 100;
	int arr[];
	int front;
	int rear;
	int size;

	DQueue(int size){
		arr = new int [max];
		front = -1;
		rear = 0;
		this.size = size;
	}

	boolean isFull(){
		return(front == 0 && rear == size - 1);
	}

	boolean isEmpty(){
		return(front == -1 && rear == -1);
	}

	void insertfront(int x){
		if(isFull()){
			System.out.println("DQ is full");
			return;
		}
		if(front == -1){
			front = 0;
			rear = 0;
		}
		else if(front == 0)
			front = size - 1;
			
		else
			front = front - 1;
		arr[front] = x;
	}

	void insertrear(int x){
		if(isFull()){
			System.out.println("DQ is full");
			return;
		}
		if(front == -1){
			front = 0;
			rear = 0;
		}
		else if(rear == size - 1)
			rear = 0;

		else 
			rear = rear + 1;
		arr[rear] = x;
	}

	void deletefront(){
		if(isEmpty()){
			System.out.println("Queue Underflow");
			return;
		}
		if(front == rear){
			front = -1;
			rear = -1;
		}
		else if(front == size - 1){
			front = 0;
		}
		else{
			front = front + 1;
		}
		
	}

	void deleterear(){
		if(isEmpty()){
			System.out.println("Queue Underflow");
			return;
		}
		if(front == rear){
			front = -1;
			rear = -1;
		}
		else if(rear == 0){
			rear = size - 1;
		}
		else{
			rear = rear - 1;
		}
		
	}

	int getFront(){
		if(isEmpty()){
			System.out.println("Underflow");
			return -1;
		}
		return arr[front];
	}
	
	int getRear(){
		if(isEmpty() || rear < 0){
			System.out.println("Underflow");
			return -1;
		}
		return arr[rear];
	}

	public static void main(String[] args) {

    	DQueue dq = new DQueue(4);

    	System.out.println("Insert element at rear end : 12 ");
    	dq.insertrear(12);

    	System.out.println("insert element at rear end : 14 ");
    	dq.insertrear(14);

    	System.out.println("get rear element : " + dq.getRear());

    	dq.deleterear();
    	System.out.println("After delete rear element new rear become : " + dq.getRear());

    	System.out.println("inserting element at front end");
    	dq.insertfront(13);

    	System.out.println("get front element: " + dq.getFront());

    	dq.deletefront();

    	System.out.println("After delete front element new front become : " + +dq.getFront());

  	}
}