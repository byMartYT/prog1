public class Main {
    public static void main(String[] args) {
        double result = 0;
        double add;
        int index = 1;

        do {
            add = Math.pow(index, -2);
            result += add;
            index++;
            double erg = 6*result;
            System.out.println(erg);
        } while (add > Math.pow(10, -5));
    }
}