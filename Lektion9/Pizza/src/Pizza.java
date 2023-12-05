public class Pizza {
  private String name;

  private PriceSize[] ps = new PriceSize[3];

  public Pizza(String name, PriceSize sm, PriceSize md, PriceSize lg) {
    this.name = name;
    this.ps[0] = sm;
    this.ps[1] = md;
    this.ps[2] = lg;
  }

  public void print() {
    PriceSize best = getBest();
    System.out.println("Pizza: " + name);
    System.out.println("Bz: " + best.getName());
    System.out.println("Größe: " + best.getSize());
    System.out.println("Preis: " + best.getPrice());
    System.out.println("P/L: " + best.getRatio());
  }

  public PriceSize getBest() {
    PriceSize best = ps[0];
    for (int i = 1; i < ps.length; i++) {
      best = best.getRatio() < ps[i].getRatio() ? ps[i] : best;
    }
    return best;
  }
}
