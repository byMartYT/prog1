import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Basis:");
    double base = sc.nextDouble();
    System.out.println("Potenz:");
    int pot = sc.nextInt();

    System.out.println(res(base, pot));

  }

  public static double res(double base, int pot) {
    if(pot == 0) {
      return base / base;
    } else {
      return base * res(base, pot-1);
    }
  }
}