import java.util.Scanner;

public class TageImMonat {

  public static void main(String[] args) {

    boolean correct = false;
    while(!correct) {
      try {
        System.out.println("Eingabe");
        System.out.println(tageImMonat(input()));
        correct = true;
      } catch (RuntimeException e) {
        System.out.println("Falsche Eingabe");
      }
    }
  }

  public static String input(){
    Scanner sc = new Scanner(System.in);
    return sc.next();
  }

  public static int tageImMonat(String monat) {
    int tage = switch (monat) {
      case "Februar" -> 28;
      case "April", "Juni", "September", "November" -> 30;
      case "Januar", "März", "Mai", "Juli", "August", "Oktober",
              "Dezember" -> 31;
      default -> throw new RuntimeException("falscher Monatsname");
    };
    return tage;
  }
}
