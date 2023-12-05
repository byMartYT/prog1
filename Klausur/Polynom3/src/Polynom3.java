public class Polynom3 {
  private static double[] value;

  public Polynom3(double x1, double x2, double x3, double t) {
    value = new double[]{x1,x2,x3,t};
  }

  public double berechneAnDerStelleX(double x) {
    return value[0]*x*x*x+value[1]*x*x+value[2]*x+value[3];
  }

  public Polynom3 leiteAb(){
    return new Polynom3(value[0]*3,value[1]*2,value[2],0);
  }

  @Override
  public String toString(){
    return String.format("%sx^3 + %sx^2 + %sx + %s", value[0],value[1],value[2],value[3]);
  }
}
