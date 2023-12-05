public class Student {
  private String name;

  public String getName() {
    return name;
  }

  public int getMat() {
    return mat;
  }

  private int mat;

  public Student(String name) {
    this.name = name;
    this.mat = (int) Math.round(Math.random()*10000);
  }

}
