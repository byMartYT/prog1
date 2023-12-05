import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

  static int fails = 0;

  static ArrayList<Character> typedChars = new ArrayList<>();
  static ArrayList<Character> rightChars = new ArrayList<>();
  static ArrayList<Character> wrongChars = new ArrayList<>();
  static ArrayList<Character> leftChars = new ArrayList<>();

  static final String[] words = {"PROGRAMMIERSPRACHEN", "Kirschkern", "Weitspuckwettbewerb", "Lokomotiv",
          "Metapher", "einpackpapier", "lebenszyklus", "druckventil"};

  static boolean playing = true;

  static String word;

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) throws InterruptedException, IOException {

    generate();
    while (playing) {
      print();
      System.out.print("Eingabe: ");
      input(sc.next().charAt(0));
    }


  }

  public static void input(char in) throws InterruptedException, IOException {
    if (in == ' ') {
      in = sc.next().charAt(0);
    }
    in = Character.toUpperCase(in);
    if (typedChars.contains(in)) {
      System.out.println("Schon eingegeben!");
      Thread.sleep(1000);
    } else {
      typedChars.add(in);
      if (leftChars.contains(in)) {
        leftChars.remove(Character.valueOf(in));
        rightChars.add(in);
      } else {
        wrongChars.add(in);
        rip(true);
      }
    }
    if (leftChars.isEmpty()) {
      System.out.println("Du hast gewonnen!");
      playing = false;
    }
  }

  public static void print() {
    rip(false);
    System.out.print("Falsch: ");
    for (int i = 0; i < wrongChars.size(); i++) {
      if (i != 0) {
        System.out.print(", ");
      }
      System.out.print(wrongChars.get(i));
    }
    System.out.println();
    for (int i = 0; i < word.length(); i++) {
      if (rightChars.contains(word.charAt(i))) {
        System.out.print(word.charAt(i));
      } else System.out.print("_");
    }
    System.out.println();

  }

  public static void generate() {
    word = words[(int) Math.round(Math.random() * (words.length - 1))].toUpperCase(Locale.GERMAN);

    for (char ch : word.toCharArray()) {
      if (!leftChars.contains(ch)) {
        leftChars.add(ch);
      }
    }
  }

  public static void rip(boolean inc) {
    if (inc) ++fails;
    switch (fails) {
      case 0:
        System.out.println("--------------");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("--------------");
        break;
      case 1:
        System.out.println("--------------");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println(" //\\\\  ");
        System.out.println("--------------");

        break;
      case 2:
        System.out.println("--------------");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("  |");
        System.out.println(" //\\\\  ");
        System.out.println("--------------");

        break;

      case 3:
        System.out.println("--------------");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("  |");
        System.out.println("  |");
        System.out.println(" //\\\\  ");
        System.out.println("--------------");
        break;

      case 4:
        System.out.println("--------------");
        System.out.println("");
        System.out.println("");
        System.out.println("  |");
        System.out.println("  |");
        System.out.println("  |");
        System.out.println(" //\\\\  ");
        System.out.println("--------------");
        break;

      case 5:
        System.out.println("--------------");
        System.out.println("");
        System.out.println("  |");
        System.out.println("  |");
        System.out.println("  |");
        System.out.println("  |");
        System.out.println(" //\\\\  ");
        System.out.println("--------------");
        break;

      case 6:
        System.out.println("--------------");
        System.out.println("   _");
        System.out.println("  |   ");
        System.out.println("  |   ");
        System.out.println("  |   ");
        System.out.println("  |   ");
        System.out.println(" //\\\\  ");
        System.out.println("--------------");
        break;
      case 7:
        System.out.println("--------------");
        System.out.println("   __");
        System.out.println("  |   ");
        System.out.println("  |   ");
        System.out.println("  |   ");
        System.out.println("  |   ");
        System.out.println(" //\\\\  ");
        System.out.println("--------------");
        break;
      case 8:
        System.out.println("--------------");
        System.out.println("   ___");
        System.out.println("  |   ");
        System.out.println("  |   ");
        System.out.println("  |   ");
        System.out.println("  |   ");
        System.out.println(" //\\\\  ");
        System.out.println("--------------");
        break;
      case 9:
        System.out.println("--------------");
        System.out.println("   ____");
        System.out.println("  |   ");
        System.out.println("  |   ");
        System.out.println("  |   ");
        System.out.println("  |   ");
        System.out.println(" //\\\\  ");
        System.out.println("--------------");
        break;
      case 10:
        System.out.println("--------------");
        System.out.println("   ____");
        System.out.println("  |    | ");
        System.out.println("  |   ");
        System.out.println("  |   ");
        System.out.println("  |   ");
        System.out.println(" //\\\\  ");
        System.out.println("--------------");
        break;
      case 11:
        System.out.println("--------------");
        System.out.println("   ____");
        System.out.println("  |    | ");
        System.out.println("  |    O ");
        System.out.println("  |   ");
        System.out.println("  |   ");
        System.out.println(" //\\\\  ");
        System.out.println("--------------");
        break;
      case 12:
        System.out.println("--------------");
        System.out.println("   ____");
        System.out.println("  |    | ");
        System.out.println("  |    O ");
        System.out.println("  |   /|\\");
        System.out.println("  |   ");
        System.out.println(" //\\\\  ");
        System.out.println("--------------");
        break;
      case 13:
        System.out.println("--------------");
        System.out.println("   ____");
        System.out.println("  |    | ");
        System.out.println("  |    O ");
        System.out.println("  |   /|\\");
        System.out.println("  |   / \\");
        System.out.println(" //\\\\  ");
        System.out.println("--------------");
        System.out.println("GAME OVER!");
        playing = false;
        break;
    }
  }
}
