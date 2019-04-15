import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Binary search tree creation and three traversals
public class BinarySearchTree {
	
	class Node{
		int key;
		Node left,right;
		
		public Node(int item){
			key = item;
			left = right = null;
		}
	}
	
	static Node root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	void insert(int key){
		root = insertRec(root,key);
	}
	
	Node insertRec(Node root,int key){
		if(root == null){
			root = new Node(key);
			return root;
		}
		if(key < root.key)
			root.left = insertRec(root.left, key);
		else if(key > root.key)
			root.right = insertRec(root.right, key);
		return root;
	}
	
	void inorder(){
		inorderRec(root);
		System.out.println();
	}
	
	void inorderRec(Node root){
		if(root != null){
			inorderRec(root.left);
			System.out.print(root.key+" ");
			inorderRec(root.right);
		}
	}
	
	void preorder(){
		preorderRec(root);
		System.out.println();
	}
	
	void preorderRec(Node root){
		if(root != null){
			System.out.print(root.key+" ");
			preorderRec(root.left);
			preorderRec(root.right);
		}
	}
	
	void postorder(){
		postorderRec(root);
		System.out.println();
	}
	
	void postorderRec(Node root){
		if(root != null){
			postorderRec(root.left);
			postorderRec(root.right);
			System.out.print(root.key+" ");
		}
	}
	
	static int findMin(Node node){
		if(node == null)
			return -1;
		else if(node.left == null)
			return node.key;
		return findMin(node.left);
	}
	
	static int findMax(Node node){
		if(node == null)
			return -1;
		else if(node.right == null)
			return node.key;
		return findMax(node.right);
	}
	
	static int findHeight(Node node){
		if(node == null)
			return -1;
		return Math.max(findHeight(node.left),findHeight(node.right)) + 1;
	}
	
	static void levelOrderTraversal(Node node){
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node);
		while(!queue.isEmpty()){
			Node temp = queue.poll();
			System.out.print(temp.key+" ");
			if(temp.left != null)
				queue.add(temp.left);
			if(temp.right != null)
				queue.add(temp.right);
		}
		System.out.println();
	}
	
	static void inorderWithoutRecursion() {
        if (root == null) {
            return;
        }
        
        //keep the nodes in the path that are waiting to be visited
        Stack<Node> stack = new Stack<Node>();
        Node node = root;
         
        //first node to be visited will be the left one
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
         
        // traverse the tree
        while (stack.size() > 0) {
           
            // visit the top node
            node = stack.pop();
            System.out.print(node.key + " ");
            if (node.right != null) {
                node = node.right;
                 
                // the next node to be visited is the leftmost
                while (node != null) {
                    stack.push(node);
                    node = node.left;
                }
            }
        }
        System.out.println();
    }
	
	static void preorderWithoutRecursion() {
        if (root == null) {
            return;
        }
        
        //keep the nodes in the path that are waiting to be visited
        Stack<Node> stack = new Stack<Node>();
        Node node = root;
         
        //first node to be visited will be the left one
        stack.push(node);
        while(!stack.empty()) {
        	Node temp = stack.peek();
        	System.out.print(temp.key+" ");
        	stack.pop();
        	
        	if(temp.right != null)
        		stack.push(temp.right);
        	if(temp.left != null)
        		stack.push(temp.left);
        }
        System.out.println();
    }
	
	static Node mirror(Node node) {
		if(node == null) {
			return node;
		}
			
		Node left = mirror(node.left);
		Node right = mirror(node.right);
		
		node.left = right;
		node.right = left;
		
		return node;		
		
	}

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		/*
		 	   50								   50
		  	/		\						      /   \
		 30			70							70     30
		/  \	    /  \					   /  \	   /  \
	  20    40     60   80					 80   60  40  20
		 */
		
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		
		tree.inorder();
		tree.preorder();
		preorderWithoutRecursion();
		tree.postorder();
		int min = findMin(root);
		System.out.println("Minimum element in the tree-------->"+min);
		int max = findMax(root);
		System.out.println("Maximum element in the tree-------->"+max);
		
		int height = findHeight(root);
		System.out.println("Height of the tree------------>"+height);
		
		//tree.postorder();
		System.out.print("Level order traversal will look as -------------->");
		levelOrderTraversal(root);
		
		inorderWithoutRecursion();
		
		mirror(root);
		inorderWithoutRecursion();
	}

}
