import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static final boolean EINGABE = false;
    static Scanner scanner = new Scanner(System.in);

    static int[] pizzaSize = new int[3];
    static double[] pizzaPrice = new double[3];


    public static void main(String[] args) {

        if(!EINGABE) {
            pizzaSize = new int[]{25, 28, 32};
            pizzaPrice = new double[]{10.99, 12.49, 15.49};
        } else {
            for (int i = 0; i < 2; i++) {
                System.out.println("Pizza " + i+1 + ":");
                System.out.println("Please enter a size");
                int size = scanner.nextInt();
                System.out.println("Please enter the price");
                double price = scanner.nextDouble();

                pizzaSize[i] = size;
                pizzaPrice[i] = price;
            }
        }
        getMostPizza();
    }

    public static void getMostPizza() {
        int index = -1;
        double pricePerSize = 0;
        for(int i = 0; i < pizzaSize.length; i++) {
            double radius = pizzaSize[i]/2.0;
            double circleArea = Math.PI * radius * radius;
            double pricePerSizeCopy = circleArea / pizzaPrice[i];
            if(pricePerSizeCopy > pricePerSize) {
                index = i;
                pricePerSize = pricePerSizeCopy;
                System.out.printf("Pizza %s %nFläche: %sqcm %nPreis: %s€ %nFläche pro €: %s %n--------------%n", index+1,circleArea, pizzaPrice[i], pricePerSizeCopy);
            }
        }

        System.out.printf("Pizza Nr. %d hat das beste Preisleistungsverhältnis. Hier bekommt man -> %s qcm pro €", index+1, pricePerSize);

    }
}