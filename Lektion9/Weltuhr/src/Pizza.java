public class Pizza {

  //Attribute
  private String name;
  private double[] durchmesser;
  private double[] preis;

  //Konstruktor
  public Pizza(String name, double[] durchmesser, double[] preis) {
    this.name = name;
    this.durchmesser = durchmesser;
    this.preis = preis;

    if (durchmesser.length != preis.length) {
      System.out.println("Überprüfen Sie Ihre Eingabe!");
      this.durchmesser = new double[0];
      this.preis = new double[0];
    }
  }

  public String gibBestes() {
    double preisleistung = preis[0]/durchmesser[0];
    String result = this.name + "\n" + "Preis: " + this.preis[0] + "\nDurchmesser: " + this.durchmesser[0] + "\nPreis-Leistung: " + preisleistung;

    for (int i = 0; i < preis.length; i++) {
      double preisl = preis[i] / durchmesser[i];
      if (preisleistung > preisl) {
        result = this.name + "\n" + "Preis: " + this.preis[i] + "\nDurchmesser: " + this.durchmesser[i] + "\nPreis-Leistung: " + preisl;
      }
    }

    return result;
  }

  public void print() {
    System.out.println(this.name);
    String d = "";
    String p = "";
    for (int i = 0; i < preis.length; i++) {
      d = d + durchmesser[i] + "  ";
      p = p + preis[i] + "  ";
    }
    System.out.println(d);
    System.out.println(p);
    System.out.println("----------");
  }


}
