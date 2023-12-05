import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean b = true;


    System.out.println("Kommazahl eingeben");
    double input = sc.nextDouble();

    if (b) {
      System.out.println("Nachkommastellen");
      int stellen = sc.nextInt();
      System.out.println(round(input, stellen));
    } else {
      System.out.println(round(input));
    }
  }

  public static int round(double number) {
    if (number % 1 >= 0.5) {
      return (int) number + 1;
    } else {
      return (int) number;
    }
  }

  public static double round(double number, int stellen) {
    double mod = mult(stellen);
    if (number % mod >= 0.5*mod) {
      return number - number % mod + 1 * mod;
    } else {
      return number - number % mod;
    }
  }

  public static double mult(int st) {
    double res = 1.0;
    for (int i = 0; i < st; i++) {
      res /= 10.0;
    }
    return res;
  }
}