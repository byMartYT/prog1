import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Geben Sie eine Zahl ein:");
        int input = 0;

        try {
            input = sc.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("FEHLER - Zahl ist ungültig.");
            main(null);
        }

        if(input < 1 || input > 1000000) {
            System.out.println("FEHLER - Zahl ist ungültig.");
            main(null);
        }
        String inputStr = Integer.toString(input);

        int res = 1;
        for (int i = 0; i < inputStr.length(); i++) {
            res *= Integer.parseInt(String.valueOf(inputStr.charAt(i)));
        }
        System.out.println("Das QP der Zahl " + input + " betraegt " + res);
    }
}