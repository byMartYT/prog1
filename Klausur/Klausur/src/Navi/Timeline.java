package Navi;

public class Timeline {

  private Post first = null;

  public void fuegePostEin(Post neu)  {
    if(first == null) {
      first = neu;
    } else {
      neu.setNext(first);
      first = neu;
    }
  }

  public void gibAus(){
    if(first == null) {
      System.out.println("Deine Timeline ist leer");
    } else {
      first.print();
    }
  }

}
