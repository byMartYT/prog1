public class Main {


  public static void main(String[] args) {
    Polynom3 pol1 = new Polynom3(1.5,4.0,1.3,-8.0);
    PolynomN pol2 = new PolynomN(new double[]{5.0,6.0,1.5,4.0,1.3,-8.0});

    //System.out.println(pol1);
    System.out.println(pol2);
    System.out.println(pol2.berechneAnDerStelleX(2));
    System.out.println(pol2.leiteAb());

  }


}