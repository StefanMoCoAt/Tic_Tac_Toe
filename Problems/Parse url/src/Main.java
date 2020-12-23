import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        String[] urlSplit = url.split("\\?");
        String[] nextUrlSplit = urlSplit[1].split("&");
        int password = 0;
        for (String s : nextUrlSplit) {
            String[] tempSub = s.split("=");
            if (tempSub.length == 2) {
                if ("pass".equals(tempSub[0])) {
                    password = Integer.parseInt(tempSub[1]);
                }
                System.out.println(tempSub[0] + " : " + tempSub[1]);
            } else {
                System.out.println(tempSub[0] + " : " + "not found");
            }
        }
        if (password > 0) {
            System.out.println("password : " + password);
        }
    }
}