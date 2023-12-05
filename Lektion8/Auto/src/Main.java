public class Main {
  public static void main(String[] args) {
    Auto[] autos = {new Auto("Audi", 2000, "weiß"),new Auto("Mercedes", 3000, "grün"), new Auto("Golf", 1200, "schwarz")};

    Auto best = autos[0];
    for(Auto auto : autos) {
      if(best.getHubraum() < auto.getHubraum()) {
        best = auto;
      }
    }

    best.print();

  }

}