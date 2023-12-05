public class Main {
  public static void main(String[] args) {
    NodeAbs root = new Final();

    root = root.insert("Moin","Hamburg");
    root = root.insert("ABC","abc");
    root = root.insert("Hallo","hallo");
    root = root.insert("Haus","haus");
    root = root.insert("Frau","frau");
    root = root.insert("Zimmer","nix");

    root.print();
  }
}