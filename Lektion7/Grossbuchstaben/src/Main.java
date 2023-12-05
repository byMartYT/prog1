import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String input = sc.nextLine();

    //Möglichkeit 1
    System.out.printf("%S%n", input);

    char[] chars = input.toCharArray();
    for(int i = 0; i < chars.length; i++) {
      chars[i] = convert(chars[i]);
    }

    System.out.println(chars);
  }

  public static char convert(char c) {
    if(c >= 97 && c <= 122) {
      return (char) (c-32);
    }
    return c;
  }
}