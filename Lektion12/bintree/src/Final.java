public class Final extends NodeAbs{
  @Override
  public NodeAbs insert(Node n) {
    return n;
  }

  @Override
  public NodeAbs insert(String w, String def) {
    return insert(new Node(w, def));
  }

  @Override
  public void print() {
  }

  @Override
  public void delete(Node n) {

  }

  @Override
  public String search(String s) {
    return null;
  }
}
