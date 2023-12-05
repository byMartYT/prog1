package Navi;

public class Post {

  private String text;
  private String absender;

  private String empfaenger;

  private Post next;

  public Post(String absender, String empfaenger, String text, Post next) {
    this.text = text;
    this.absender = absender;
    this.empfaenger = empfaenger;
    this.next = next;
  }

  public void setNext(Post next) {
    this.next = next;
  }
  public void print() {
    System.out.println(absender + " -> " + empfaenger);
    System.out.println(text);
    System.out.println();
    if(next != null) next.print();
  }
}
