
public class Linkedlist {
	
	Node head;
	
	public class Node{
		int data;
		Node next;
		Node(int value){
			data = value;
			next = null;
		}
	}
	
	//insert node at the beginning
	public void push (int data){
		Node n = new Node(data);
		n.next = head;
		head = n;
	}
	
	//insert new node after specified node
	public void insertAfter(Node prev_node,int data){
		if(prev_node == null){
			System.out.println("Previous node cannot be null");
			return;
		}
		Node n = new Node(data);
		n.next = prev_node.next;
		prev_node.next = n;
	}
	
	//insert the node at the end
	public void append(int data){
		Node n = new Node(data);
		if(head == null){
			head = new Node(data);
			return;
		}
		n.next = null;
		Node temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = n;
	}
	
	public void printList(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	// return kth node from the last using two pointers
	public int resultNode(Node head,int k){
		Node result = head;
		Node temp = head;
		while(k > 1){
			temp = temp.next;
			k--;
		}
		while(temp.next != null){
			result = result.next;
			temp = temp.next;
		}
		return result.data;
	}
	
	//reverse the linked list
	public Node reverse(Node head){
		Node next = null;
		Node current = head;
		Node prev = null;
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}
	
	public static void main(String args[]){
		Linkedlist list = new Linkedlist();
		list.append(6);
		list.push(7);
		list.push(1);
		list.append(4);
		list.insertAfter(list.head,8);
		System.out.println("Created Linked list: "); // 1 8 7 6 4
		list.printList();
		
		list.head = list.reverse(list.head);
		System.out.println("After reversing Linked list: "); //4 6 7 8 1
		list.printList();
		
		
		//given "k" return the kth element from the end 
		/*int k = 2;
		System.out.println("ResultNode------>"+list.resultNode(list.head,k));*/
	}
	
}
