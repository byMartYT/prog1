public class Main {
  public static void main(String[] args) {

    NodeAbs start = new Node(30, "Meyer");

    start = start.insert("Thomas", 25);
    start = start.insert("Anna", 45);
    start = start.insert("Leoni", 60);
    start = start.insert("Max", 10);
    start = start.insert("Max2", 10);


    start.print();

    System.out.println();
  }
}