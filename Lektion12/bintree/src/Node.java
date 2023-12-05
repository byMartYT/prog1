public class Node extends NodeAbs{
  private String word;
  private String def;

  private NodeAbs left;
  private NodeAbs right;

  public Node(String word, String def) {
    this.word = word;
    this.def = def;
    left = new Final();
    right = new Final();
  }

  public String getWord() {
    return word;
  }

  @Override
  public NodeAbs insert(Node n) {
    if(biggerThan(n.getWord())){
      right = right.insert(n);
    } else {
      left = left.insert(n);
    }
    return this;
  }

  @Override
  public NodeAbs insert(String w, String def) {
    Node n = new Node(w, def);
    return insert(n);
  }

  @Override
  public void print() {
    left.print();
    System.out.println("Wort: " + word);
    System.out.println("Def: " + def);
    System.out.println();
    right.print();
  }

  @Override
  public void delete(Node n) {
  }

  @Override
  public String search(String s) {
    if(s.equalsIgnoreCase(word)) {
      return def;
    }
    if(biggerThan(s)) {
      return right.search(s);
    } else {
      return left.search(s);
    }
  }

  public boolean biggerThan(String word) {
    return this.word.compareToIgnoreCase(word) < 0;
  }
}
