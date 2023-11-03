class BST1{
	
	Node root;

	static class Node
	{
		int data;
		Node left, right;
	
		Node(int d)
		{
			this.data = d;
			this.left = right = null;
		}
	}
	
	BST1()
	{
		root = null;		//No Tree is Existing
	}
	
	BST1(int d)
	{
		root = new Node(d);//Root assign kar rahe hai
	}
	
	void printInorder(Node root) // lc root rc
	{
		if(root == null)
			return;
		printInorder(root.left);
		System.out.print(root.data+ " ");
		printInorder(root.right);
	}
	
	void printPreorder(Node root)	// root lc rc
	{
		if(root == null)
			return;
	
		System.out.print(root.data+ " ");
		printPreorder(root.left);
		printPreorder(root.right);
	
	}

	void printPostorder(Node root)	// lc rc root
	{
		if(root == null)
		return;
	
		printPostorder(root.left);
		printPostorder(root.right);
		System.out.print(root.data+ " ");
	
	}
	void Inorder(){
		printInorder(root);
	}
	
	void Preorder(){
		printPreorder(root);
	}
	
	void Postorder(){
		printPostorder(root);
	}

	Node insertData(Node root, int key)
	{
		if(root == null)
		{
			root = new Node(key);
			return root;
		}
		if(key <= root.data)
		{
			root.left = insertData(root.left, key);
		}
		else
		{
			root.right = insertData(root.right, key);
		}
		return root;
	}

	void insert(int key)
	{
		root = insertData(root, key);
	}

	Node deleteData(Node root, int key) 	// 
	{
		if(root == null)
			return ;

		if(key <= root.data)
			root.left = deleteData(root.left, key);

		else if(key > root.data)
			root.right = deleteData(root.right, key);

		else
		{
			if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;

			//case 3: 2 child
			root.data = minvalue(root.right);

			root.right = deleteData(root.right, root.data);
		}
		return root;
	}

	int minvalue(Node root){
		int x = root.data;
		while(root.left != null){
			x = root.left.data;
			root = root.left;
		}
		return x;
	}

	void delete(int key){
		root = deleteData(root, key);
	}
	
	public static void main(String args[])
	{
		BST1 t1 = new BST1();
		t1.insert(10);
		t1.insert(8);
		t1.insert(25);
		t1.insert(5);
		t1.insert(9);
		t1.insert(22);
		t1.insert(42);
		t1.insert(2);
		
		System.out.println("Inorder");
		t1.Inorder();
		
		System.out.println();
		System.out.println("Preorder");
		t1.Preorder();
		
		System.out.println();
		System.out.println("Postorder");
		t1.Postorder();
		
		//case 1 : deletion with leaf node
		t1.delete(9);
		System.out.println("Inorder");
		t1.Inorder();

		//case 2 : deletion with one child node
		t1.delete(5);
		System.out.println("Inorder");
		t1.Inorder();

		//case 3 : deletion with two child node
		t1.delete(8);// 25
		System.out.println("Inorder");
		t1.Inorder();
	}
}