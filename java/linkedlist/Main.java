
public class Main {
  public static void main(String[] args) {
    SinglyLinkedList list = new SinglyLinkedList();

    list.append(20);
    list.append("suki liar");
    list.append("kerjain skripsinya");
    list.prepend(23);
    list.prepend(33);
    list.display();
    list.removeAt(2);
    list.display();


    BallPlayer balling = new BallPlayer();
    balling.append("febry goy");
    balling.append("faiz goy");
    balling.prepend("isna goy");
    balling.display();
    balling.removeAt(2);
    balling.display();

    //LinkedList list = new LinkedList();
    //list.append(20);
    //list.append(43);

    // list.deleteHead();
    // list.deleteByPosition(3);
    //list.append(444);

    //list.insertByPosition(1, 69);

    //System.out.println("Linked list: ");
    //list.display();

    //System.out.println(list.search(44));
  }
}
