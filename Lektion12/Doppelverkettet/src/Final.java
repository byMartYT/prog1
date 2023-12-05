public class Final extends NodeAbs{

  private Node n;

  public Final(Node n) {
    this.n = n;
  }

  @Override
  public Node search(String name) {
    return null;
  }

  @Override
  public NodeAbs insert(Node nd) {
    nd.setPre(n);
    this.n = nd;
    nd.setPost(this);
    return nd;
  }

  @Override
  public NodeAbs insert(String s, int a) {
    return insert(new Node(a, s));
  }

  @Override
  public void print() {
    n.printPost();
  }

  @Override
  public void printPost() {

  }
}
