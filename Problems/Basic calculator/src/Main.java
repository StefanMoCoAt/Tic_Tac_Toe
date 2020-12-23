import java.util.Objects;

class Problem {

    public static void main(String[] args) {

        String operator = null;
        int value1 = 0;
        int value2 = 0;

        if (args.length == 3) {
            operator = args[0];
            value1 = Integer.parseInt(args[1]);
            value2 = Integer.parseInt(args[2]);
        }

        switch (Objects.requireNonNull(operator)) {
            case "+":
                System.out.println(value1 + value2);
                break;
            case "-":
                System.out.println(value1 - value2);
                break;
            case "*":
                System.out.println(value1 * value2);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }

    }
}