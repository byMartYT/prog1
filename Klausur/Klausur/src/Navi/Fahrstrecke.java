package Navi;

public class Fahrstrecke {
  private Zielort first = new Zielort(null, -1);

  public void insert(String name, int distance) {
    Zielort neu = new Zielort(name, distance);
    first = first.insert(neu);
  }

  public void getLength() {
    first.getLength();
  }

  @Override
  public String toString(){
    return first.toString();
  }

}
