public class Node extends NodeAbs {

  private int age;
  private String lastName;

  private NodeAbs pre;
  private NodeAbs post;

  public Node(int age, String lastName) {
    this.age = age;
    this.lastName = lastName;
    this.post = new Final(this);
    this.pre = new Final(this);
  }

  public void setPre(NodeAbs pre) {
    this.pre = pre;
  }

  public void setPost(NodeAbs post) {
    this.post = post;
  }

  public int getAge() {
    return age;
  }

  public String getLastName() {
    return lastName;
  }

  @Override
  public Node search(String name) {
    if (lastName.equalsIgnoreCase(name)) {
      return this;
    } else {
      return post.search(name);
    }
  }

  @Override
  public NodeAbs insert(Node nd) {
    if (age <= nd.getAge()) {
      post = post.insert(nd);
      return this;
    } else {
      nd.setPre(pre);
      nd.setPost(this);
      pre = nd;
      return nd;
    }
  }

  public NodeAbs insert(String name, int age) {
    Node nd = new Node(age, name);
    return insert(nd);
  }

  @Override
  public void print() {
    System.out.println("Name: " + lastName + " Alter: " + age);
    post.print();
  }

  @Override
  public void printPost() {
    System.out.println("Name: " + lastName + " Alter: " + age);
    pre.printPost();
  }
}
