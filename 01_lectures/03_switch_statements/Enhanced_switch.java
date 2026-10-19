import java.util.Scanner;

public class Enhanced_switch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // String fruit = in.next();
        // switch (fruit) {
        // case "mango" -> System.out.println("YELLOW");
        // case "apple" -> System.out.println("RED");
        // case "orange" -> System.out.println("ORANGE");
        // case "grapes" -> System.out.println("GREEN");
        // default -> System.out.println("INVALID!");
        // }

        int day = in.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid!");
        }

        in.close();
    }
}
