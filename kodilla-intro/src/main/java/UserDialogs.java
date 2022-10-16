import java.util.Scanner;
public class UserDialogs {
    public static String getUsername() {
        Scanner scanner = new Scanner(System.in);                 // [1]
        while (true) {                                            // [2]
            System.out.println("Enter first letter of your color:");               // [3]
            String letter = scanner.nextLine().trim();              // [4]
            if (letter.length() == 1) {                             // [5]
                return letter;                                      // [6]
            }
            System.out.println("Only one letter. Try again.");
        }
    }

    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select letter (B-blue, G-green, R-red, Y-yellow, P-purple):");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "B":
                    return "black";
                case "G":
                    return "green";
                case "R":
                    return "red";
                case "Y":
                    return "yellow";
                case "P":
                    return "purple";
                default:
                    System.out.println("Wrong letter. Try again.");
            }
        }
    }

    public static int getValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int val = scanner.nextInt();
        return val;
    }

    public static void main(String[] args) {
        String letter = getUserSelection();
        System.out.println("Your color is: " + letter);
    }
}
