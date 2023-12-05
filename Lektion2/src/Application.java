public class Application {
    public static void main(String[] args) {
        two(-4,7);
    }

    public static void one(double radius) {
        double PI = Math.PI;
        System.out.printf("Kreisfläche: %s\n", (PI*Math.pow(radius, 2)));
        System.out.printf("Kreisumfang: %s\n", (2*PI*radius));
        System.out.printf("Volumen: %s\n", (4/3*PI*Math.pow(radius, 3)));
    }

    public static void two(double p, double q) {
        double res[] = new double[2];
        double halfP = p/2.0;
        double secPart = (Math.pow(halfP,2.0)-q);
        if(secPart < 0) {
            System.out.println("Keine Nullstellen!");
            return;
        }
        res[0] = (-halfP+Math.sqrt(secPart));
        res[1] = (-halfP-Math.sqrt(Math.pow(halfP,2)-q));

        System.out.println("x1 = " + res[0]);
        System.out.println("x2 = " + res[1]);
    }
}
