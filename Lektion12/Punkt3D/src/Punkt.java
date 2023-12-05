public class Punkt {

  private int x, y, z;

  public Punkt(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public double calcDistance(){
    double x = this.x * this.x;
    double y = this.y * this.y;
    double z = this.z * this.z;

    double res = x+y+z;

    return Math.sqrt(res);
  }

  @Override
  public String toString(){
    return String.format("a=%s, b=%s, c=%s", this.x, this.y, this.z);
  }

}
