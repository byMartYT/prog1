public class PolynomN {
  private double[] value;

  public PolynomN(double[] value) {
    this.value = value;
  }

  public double berechneAnDerStelleX(double x) {
    int expo = value.length-1;
    double res = 0;
    for (int i = 0; i < value.length; i++) {
      res += value[i] * hoch(x, expo--);
    }
    return res;
  }

  public double hoch(double basis, int exponent) {
    double res = basis;
    if (exponent == 0) {
      return 1;
    }
    for (int i = 0; i < exponent-1; i++) {
      res *= basis;
    }
    return res;
  }

  public PolynomN leiteAb(){
    double[] values = new double[value.length-1];
    int expo = value.length-1;
    for (int i = 0; i < value.length-1; i++) {
      values[i] = value[i] * expo--;
    }
    return new PolynomN(values);
  }

  @Override
  public String toString(){
    String result = "";
    int expo = value.length-1;
    for (int i = 0; i < value.length; i++) {
      if(expo != 0) {
        result += String.format("%sx^%d + ", value[i], expo--);
      } else {
        result += value[i];
      }
    }
    return result;
  }

}
