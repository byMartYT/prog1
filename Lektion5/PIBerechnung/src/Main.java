import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Wie viele Rechtecke?:");
    int input = sc.nextInt();

    double width = 1.0 / input;
    double newWidth = 0.0;

    double area = 0.0;
    double pi = 0.0;

    for (int i = 0; i < input; i++) {
      double height;
      height = Math.sqrt(1.0 - (newWidth * newWidth));
      newWidth += width;
      area += height * width;
      pi = area * 4;
    }

    System.out.println("Pi beträgt: " + pi);
    System.out.println("Differenz: " + Math.abs(Math.PI - pi));
  }
}