public class Main {
  public static void main(String[] args) {
    Pizza[] pizzen = {
            new Pizza("Salami",
                    new PriceSize("small", 25, 10),
                    new PriceSize("medium", 29, 12),
                    new PriceSize("large", 32, 15)),
            new Pizza("Margherita",
                    new PriceSize("small", 23, 6),
                    new PriceSize("medium", 29, 8),
                    new PriceSize("large", 35, 9)),
            new Pizza("Schinken",
                    new PriceSize("small", 25, 11),
                    new PriceSize("medium", 29, 13),
                    new PriceSize("large", 32, 15.5)),
            new Pizza("Hawaii",
                    new PriceSize("small", 25, 12),
                    new PriceSize("medium", 29, 14.5),
                    new PriceSize("large", 32, 17)),
            new Pizza("Diavolo",
                    new PriceSize("small", 25, 11),
                    new PriceSize("medium", 29, 13),
                    new PriceSize("large", 32, 15.5))
    };

    Pizza best = pizzen[0];
    for (Pizza p : pizzen) {
      if(best.getBest().getRatio() < p.getBest().getRatio()) {
        best = p;
      }
    }

    best.print();

  }
}

