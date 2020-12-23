import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String form = scan.next();
        double answer;

        switch (form) {
            case "triangle":
                double a = scan.nextInt();
                double b = scan.nextInt();
                double c = scan.nextInt();
                answer = Formula.triangleArea(a, b, c);
                break;
            case "rectangle":
                double l = scan.nextInt();
                double w = scan.nextInt();
                answer = Formula.rectangleArea(l, w);
                break;
            case "circle":
                double r = scan.nextInt();
                answer = Formula.circleArea(r);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + form);
        }
        System.out.println(answer);
    }

    static class Formula {
        public static double triangleArea(double a, double b, double c) {
            double s = (a + b + c) / 2;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }

        public static double rectangleArea(double l, double w) {
            return l * w;
        }

        public static double circleArea(double r) {
            return 3.14 * r * r;
        }
    }

}