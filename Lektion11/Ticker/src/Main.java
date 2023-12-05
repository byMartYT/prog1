public class Main {
  public static void main(String[] args) {
    Ticker t1 = new Ticker(45);

    t1.setNachricht("Wettervorhersage: Schnee in Wuerzburg".toCharArray());

    System.out.println(t1.getNachricht());

    t1.rotateNachricht(6);

    System.out.println(t1.getNachricht());
  }
}