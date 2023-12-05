public class Main {
  public static void main(String[] args) {
    // Zahl unter der Wurzel
    double base = 100003403432.0;

    // Anfangszahl
    double sqrt = 1;

    int count = 0;

    do {
      count++;
      sqrt = (sqrt+(base/sqrt))/2.0;
    } while (Math.abs((base/sqrt)-sqrt) > Math.pow(10, -10));

    System.out.println("Math.sqrt: " + Math.sqrt(base));

    System.out.println("Ergebnis: " + sqrt + " " + count + " Durchgänge");

    //B
    sqrt = 1;
    for (int i = 0; i < 10; i++) {
      sqrt = (sqrt+(base/sqrt))/2.0;
    }
    System.out.println("Ergebnis 10mal: " + sqrt + " Differenz: " + Math.abs(Math.sqrt(base) - sqrt));
    sqrt = 1;
    for (int i = 0; i < 100; i++) {
      sqrt = (sqrt+(base/sqrt))/2.0;
    }
    System.out.println("Ergebnis 100mal: " + sqrt + " Differenz: " + Math.abs(Math.sqrt(base) - sqrt));
    sqrt = 1;
    for (int i = 0; i < 1000; i++) {
      sqrt = (sqrt+(base/sqrt))/2.0;
    }
    System.out.println("Ergebnis 1000mal: " + sqrt + " Differenz: " + Math.abs(Math.sqrt(base) - sqrt));
    sqrt = 1;
    for (int i = 0; i < 10000; i++) {
      sqrt = (sqrt+(base/sqrt))/2.0;
    }
    System.out.println("Ergebnis 10000mal: " + sqrt + " Differenz: " + Math.abs(Math.sqrt(base) - sqrt));

  }
}