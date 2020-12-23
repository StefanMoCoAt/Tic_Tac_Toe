import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        List<String[]> rooms = new ArrayList<>();
        List<String> guestList = new ArrayList<>();

        rooms.add(scanner.nextLine().split(" "));
        rooms.add(scanner.nextLine().split(" "));
        rooms.add(scanner.nextLine().split(" "));
        rooms.add(scanner.nextLine().split(" "));

        for (String[] room : rooms) {
            guestList.addAll(Arrays.asList(room));
        }

        Collections.reverse(guestList);

        for (String guestReverse : guestList) {
            System.out.println(guestReverse);
        }

    }
}