class Node {
	int data;
	Node next;

	Node(int value) {
		this.data = value;
		this.next = null;
	}
}

class SinglyLinkedList {
	Node head;
	Node tail;

	public void insert(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		tail = head;
		while(tail.next != null) {
			tail = tail.next;
		}

		tail.next = newNode;
	}

	public void deleteHead() {
		if (head != null) {
			head = head.next;
		}
	}

	public void deleteTail() {
		// no node
		if (head == null) {
			return;
		}

		if (head.next == null) {
			head = null;
			return;
		}

		// many nodes
		Node current = head;
		while(current.next.next != null) {
			current = current.next;
		}
		current.next = null;
	}

	public void display() {
		Node tail = head;

		while (tail != null) {
			System.out.print(tail.data + "->");
			tail = tail.next;
		}

		System.out.println("null");
	}
}


