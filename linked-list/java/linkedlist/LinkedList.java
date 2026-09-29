class Node {
	Object data;
	Node next;

	Node(Object value) {
		this.data = value;
		this.next = null;
	}
}

abstract class LinkedList {
  Node head;
  Node tail;
  int total;

  abstract boolean isEmpty(); 

  abstract void append(Object data);
  abstract void prepend(Object data);

  abstract void removeTail();
  abstract void removeHead();

  abstract Object search(Object data);

  abstract void display();

  // abstract void append(int data) {
  //   Node newNode = new Node(data);

  //   if (head == null) {
  //     head = newNode;
  //     tail = newNode;
  //     return;
  //   }

  //   tail.next = newNode;
  //   tail = newNode;
  // }

  // public void insertByPosition(int position, int data) {
  //   Node newNode = new Node(data);
  //   Node current = head;
  //
  //   if (position == 1) {
  //     newNode.next = head;
  //   }
  //
  //   for (int i = 1; i < (position - 1); i++) {
  //     current = current.next;
  //   }
  //
  //   Node after = current.next;
  //   current.next = newNode;
  //   current.next.next = after;
  // }

  // abstract void deleteHead() {
  //   if (head != null) {
  //     head = head.next;
  //   }
  // }

  // abstract void deleteTail() {
  //   // no node
  //   if (head == null) {
  //     return;
  //   }

  //   if (head.next == null) {
  //     head = null;
  //     return;
  //   }

  //   // many nodes
  //   Node current = head;
  //   while (current.next.next != null) {
  //     current = current.next;
  //   }
  //   current.next = null;
  // }

  // abstract void deleteByPosition(int position) {
  //   Node current = head;

  //   if (position == 1) {
  //     deleteHead();
  //     return;
  //   }

  //   for (int i = 1; i < position - 1; i++) {
  //     current = current.next;
  //   }

  //   if (current == null || current.next == null) {
  //     System.out.println("out of the position!");
  //     return;
  //   }

  //   current.next = current.next.next;

  // }

  // abstract int search(int data) {
  //   Node temp = head;
  //   int index = 0;
  //   while (temp.data != data) {
  //     index++;
  //     temp = temp.next;

  //     if (temp == null) {
  //       System.out.println("there is no value");
  //       return -1;
  //     }
  //   }
  //   return index;
  // }

  // public void display() {
  //   Node tail = head;

  //   while (tail != null) {
  //     System.out.print(tail.data + "->");
  //     tail = tail.next;
  //   }

  //   System.out.println("null");
  // }
}
