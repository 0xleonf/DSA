
class Node {
  long data;
  Node next;

  Node(long value) {
    this.data = value;
    this.next = null;
  }
}

class Stack {
  Node up;
  int size;

  Stack() {
    this.up = null;
    this.size = 0;
  }

  boolean empty() {
    return this.up == null;
  }

  public void push(long data) {
    Node newNode = new Node(data);

    newNode.next = this.up;

    this.up = newNode;
    this.size++;
  }

  public void pop(int total) {
    if (empty()) {
      System.out.println("failed to deleted, no stack here!");
      return;
    }
    for (int i = 0; i < total; i++) {
      this.up = this.up.next;
      this.size--;
    }
  }

  long checkTop() {
    if (empty()) {
      System.out.println("stack empty");
      return -1;
    }

    return this.up.data;
  }
}
