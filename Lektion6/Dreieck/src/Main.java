import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Zeilen:");
    int input = sc.nextInt();

    for (int i = 1; i < input + 1; i++) {
      space(input, i);
      for (int j = 1; j < i + 1; j++) {
        System.out.print("*   ");
      }
      System.out.println();
    }
  }

  public static void space(int input, int index) {
    int spacing = (input-index)*2;
    for (int j = 0; j < spacing; j++) {
      System.out.print(" ");
    }
  }
}