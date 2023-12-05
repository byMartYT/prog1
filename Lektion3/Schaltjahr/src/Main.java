import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        if (input % 4 == 0) {
            if (input % 100 == 0) {
                if (input % 400 == 0) {
                    System.out.println(input + " ist ein Schaltjahr, da ganzzahlig durch 4 und 100 teilbar, aber auch durch 400");
                } else {
                    System.out.println(input + " ist kein Schaltjahr, da ganzzahlig durch 4 und 100 teilbar, aber nicht durch 400");
                }
            } else {
                System.out.println(input + " ist ein Schaltjahr, da ganzzahlig durch 4 teilbar");
            }
        } else {
            System.out.println(input + " ist kein Schaltjahr, da nicht ganzzahlig durch 4 teilbar");
        }
    }
}