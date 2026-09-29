import java.util.Objects;

class SinglyLinkedList extends LinkedList {
  @Override 
  boolean isEmpty() {
    return head == null;
  }

  @Override 
  void append(Object data) {
    Node newNode = new Node(data);

    if (head == null) {
        head = newNode;
        tail = newNode;
        return;
    }

    tail.next = newNode;

    tail = newNode;
  }

  @Override 
  void prepend(Object data) {
    Node newNode = new Node(data);

    newNode.next = head;
    head = newNode;
  }

  void insertAt(int index, Object data) {
    Node newNode = new Node(data);
    Node current = head;

    // head node
    if (index == 0) {
      prepend(data);
    }

    // not head either tail
    for (int i = 0; i < (index - 1); i++) {
      current = current.next;
    }

    Node after = current.next;
    current.next = newNode;
    current.next.next = after;
  }

  @Override 
  void removeTail() {
    if (head == null) {
        return;
    }

    if (head.next == null) {
        head = null;
        return;
    }

    Node current = head;
    while (current.next.next != null) {
        current = current.next;
    }

    current.next = null;
  }

  @Override 
  void removeHead() {
    if (head == null) {
        return;
    }

    Node temp = head;
    head = head.next;
    temp = null;
  }

  @Override 
  Object search(Object data) {
    Node temp = head;

    int index = 0;
    while (!Objects.equals(temp.data, data)) {
        index++;
        temp = temp.next;

        if (temp == null) {
            System.out.println("there is no value");
            return -1;
        }
    }

    return index;
  }

  @Override 
  void display() {
    Node current = head;

    while(current != null) {
        System.out.print(current.data + " -> ");
        current = current.next;
    }
    System.out.println("null");
  }
}
