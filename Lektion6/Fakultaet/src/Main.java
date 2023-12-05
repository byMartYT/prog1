import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Zahl eingeben:");

    System.out.println(fak(sc.nextLong()));
  }

  public static String formatName(String firstName, String lastName) {
    return String.format("%s, %s", lastName, firstName);
  }

  public static String formatNameWithMatrNr(String firstName, String scdName, int matr) {
    return String.format("%s, %s (%d)", firstName,scdName,matr);
  }

  public static String formatNameWithMatrNrAndMail(String firstName, String scdName, int matr, String email) {
    return String.format("%s, %s (%d): %s", firstName,scdName,matr,email);
  }

  public static long fakLoop(int i) {
    long res = 1;
    for (long j = i; j > 0; j--) {
      res *= j;
    }
    return res;
  }

  public static long fak(long i) {
    if(i == 1) {
      return 1;
    } else {
      return i * fak(--i);
    }
  }

}