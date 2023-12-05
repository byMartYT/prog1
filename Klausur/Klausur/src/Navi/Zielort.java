package Navi;

public class Zielort {
  private String name;
  private int distance;
  private Zielort next;

  public Zielort(String name, int distance) {
    this.name = name;
    this.distance = distance;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getDistance() {
    return distance;
  }

  public void setDistance(int distance) {
    this.distance = distance;
  }

  public Zielort getNext() {
    return next;
  }

  public void setNext(Zielort next) {
    this.next = next;
  }

  public Zielort insert(Zielort neu){
    if(distance == -1) {
      neu.setNext(this);
      return neu;
    } else {
      next = next.insert(neu);
      return this;
    }
  }

  public int getLength() {
    if(distance == -1) {
      return 0;
    } else {
      return distance + next.getLength();
    }
  }

  @Override
  public String toString() {
    return String.format("%s (%d km)", name, distance) + next.toString();
  }
}
