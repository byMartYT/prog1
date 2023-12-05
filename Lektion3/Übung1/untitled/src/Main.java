import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int res = number % 7;

        if(res == 0) {
            System.out.println("Die Zahl ist durch 7 teilbar!");
        } else {
            System.out.println("Die Zahl ist nicht durch 7 teilbar! Rest: " + res);
        }
    }
}

/*
b.
1.
Es ändert nicht viel. Ähnlich, als würde man eine negative Zahl durch eine positive Zahl teilen. Hier ist das Ergebnis nach der
Modulo Rechnung negativ.

2.
Dann wird der Rest genauso berechnet. Ob es sinnvoll ist, lässt sich so einfach nicht schließen.

Es kommt auf den Anwendungszweck an.


*/