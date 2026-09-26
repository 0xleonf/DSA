public class Main {
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.insert(20);
		//list.insert(43);

		//list.deleteHead();
		list.deleteTail();

		System.out.println("Linked list: ");
		list.display();
	}
}