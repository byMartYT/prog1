package Navi;

import java.util.Scanner;

public class Navi {
  

  public static void main(String[] args) {
    /*Fahrstrecke fs = new Fahrstrecke();
    fs.insert("Würzburg", 0);
    fs.insert("Kitzingen", 19);
    fs.insert("Neustadt", 42);
    fs.insert("Nürnberg", 49);
    System.out.println(fs);

    //System.out.println(zaehleVielfacheVonDrei(new int[]{0, 3, -3, -12}));

    //System.out.println(harmonie());

    //printQuadrat(4);

    Timeline tl = new Timeline();
    tl.gibAus();
    tl.fuegePostEin(new Post("Thomas", "Bob", "Moin Moin", null));
    tl.fuegePostEin(new Post("Thomas", "Bob", "Moin Moin!", null));
    tl.fuegePostEin(new Post("Thomas", "Bob", "Wat Geht?", null));
    tl.gibAus();

    System.out.println(berechneNettopreis(1.07,0.07));
     */

    //System.out.println(liesZahl());

    System.out.println(stringReverse("moin moin"));

  }


  public static int zaehleVielfacheVonDrei(int[] arr) {
    int count = 0;

    for (int i = 0; i < arr.length; i++) {
      if(arr[i] == 0) continue;
      if(arr[i] % 3 == 0) {
        count++;
      }
    }

    return count;
  }

  public static double harmonie(){
    double ergebnis = 0;
    int zaehler = -1;
    for (int i = 1; i < 10001; i++) {
      zaehler *= -1;
      ergebnis += ((double) zaehler / (double) i);
    }
    return ergebnis;
  }

  public static void printQuadrat(int quad) {
    for (int i = 0; i < quad; i++) {
      System.out.print("*");
    }
    System.out.println();
    for (int i = 0; i < quad-2; i++) {
      System.out.print("*");
      for (int j = 0; j < quad-2; j++) {
        System.out.print(" ");
      }
      System.out.println("*");
    }
    for (int i = 0; i < quad; i++) {
      System.out.print("*");
    }
  }

  public static double berechneNettopreis(double brutto, double steuer){
    return brutto/(1+steuer);
  }

  public static int liesZahl(){
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    char[] inputChar = input.toCharArray();

    for (int i = 0; i < inputChar.length; i++) {
      if(i == 0 && inputChar[i] == '-' && inputChar.length > 1) continue;
      if((inputChar[i] < 48 || inputChar[i] > 57)) {
        System.out.println("Bitte nur Ganzzahlen eingeben!");
        return liesZahl();
      }
    }
    return Integer.valueOf(input);
  }

  public static String stringReverse(String text) {
    char[] ch = new char[text.length()];
    int j = 0;
    for (int i = text.length()-1; i >= 0; i--) {
      ch[j] = text.charAt(i);
      j++;
    }

    String resukt = String.valueOf(ch);
    return resukt;
  }


}

