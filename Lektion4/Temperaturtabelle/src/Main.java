public class Main {
    public static void main(String[] args) {

        System.out.println("Fahrenheit      Celsius");
        for (int i = 0; i <= 300; i++) {
            float celsius = 5f/9f * (i-32);
            System.out.printf("%-3d%20.2f%n",i,celsius);
        }
    }
}