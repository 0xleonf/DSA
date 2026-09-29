public class Main {
  public static void main(String[] args) {
    Stack tumpukan = new Stack();

    tumpukan.push(100);
    tumpukan.push(129);
    tumpukan.push(2333);

    System.out.println("data terakhir " + tumpukan.checkTop());
    System.out.println("ukuran tumpukan " + tumpukan.size);

    tumpukan.pop(3);

    System.out.println("data terakhir " + tumpukan.checkTop());
    System.out.println("ukuran tumpukan " + tumpukan.size);
    tumpukan.pop(1);
  }
}
