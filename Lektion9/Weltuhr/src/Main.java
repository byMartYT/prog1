public class Main {
  public static void main(String[] args) {

    double[] d = {26.0,28.0,32.0};

    Pizza p1 = new Pizza("Speziale", d, new double[]{8.0,10.0,12.0});
    Pizza p2 = new Pizza("Margherita", d, new double[]{6.0,8.0,10.0});
    Pizza p3 = new Pizza("Salami", d, new double[]{7.0,9.0,11.0});

    Pizza[] pizzen = {p1,p2,p3};

    //p1.print();
    //p2.print();
    //p3.print();

    for (int i = 0; i < pizzen.length; i++) {
      System.out.println(pizzen[i].gibBestes());
    }

    //System.out.println(p1.gibBestes());
  }


}