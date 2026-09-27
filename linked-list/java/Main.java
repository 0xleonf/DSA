public class Main {
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.insert(20);
		list.insert(43);

		//list.deleteHead();
		//list.deleteByPosition(3);
		list.insert(444);

    list.insert_by_position(3, 69);

		System.out.println("Linked list: ");
		list.display();

		System.out.println(list.search(44));
	}
}
