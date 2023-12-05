public class PriceSize {
  private String name;
  private int size;
  private double price;

  public int getSize() {
    return size;
  }

  public double getPrice() {
    return price;
  }

  public double getRatio() {
    return (double) size / (double) price;
  }

  public PriceSize(String name, int size, double price) {
    this.name = name;
    this.size = size;
    this.price = price;
  }

  public String getName() {
    return name;
  }
}
