public class Main {
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.insert(20);
		list.insert(43);
		list.insert(42);

		//list.deleteHead();
		list.deleteByPosition(3);

		System.out.println("Linked list: ");
		list.display();
	}
}