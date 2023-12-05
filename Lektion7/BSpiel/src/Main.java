import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();

    char[] chars = s.toCharArray();

    int space = 0;
    for(char c : chars) {
      if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        space += 2;
      }
    }
    space += chars.length;
    char[] newChars = new char[space];

    int pointer = 0;
    for (int i = 0; i < chars.length; i++) {
      char c = chars[i];
      if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        newChars[pointer] = c;
        newChars[++pointer] = 'b';
        newChars[++pointer] = c;
        pointer++;
      } else {
        newChars[pointer++] = chars[i];
      }
    }

    System.out.println(String.valueOf(newChars));

  }
}