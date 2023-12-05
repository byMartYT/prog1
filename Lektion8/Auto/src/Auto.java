public class Auto {
  private String marke;
  private int hubraum;
  private String farbe;

  private static int produzierteAutos = 0;

  public Auto(String marke, int hubraum, String farbe) {
    produzierteAutos++;
    this.marke = marke;
    if (hubraum > 0) this.hubraum = hubraum;
    else this.hubraum = 1600;
    this.farbe = farbe;
  }

  public static int getProduzierteAutos() {
    return produzierteAutos;
  }

  public void setHubraum(int hubraum) {
    if (hubraum > 0) this.hubraum = hubraum;
  }

  public void print() {
    System.out.println(marke);
    System.out.println(hubraum);
    System.out.println(farbe);
  }

  public int getHubraum() {
    return hubraum;
  }
}
