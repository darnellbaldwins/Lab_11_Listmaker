import java.util.Scanner;
public class SafeInput {
    private static Scanner scanner = new Scanner(System.in);
    public static String getRegExString(String prompt, String regex) {
        String input;
        while (true) {
            System.out.print(prompt);
            input = scanner.nextLine();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }
    public static String getNonZeroLengthString(String prompt) {
        String input;
        while (true) {
            System.out.print(prompt);
            input = scanner.nextLine();
            if (!input.trim().isEmpty()) {
                return input;
            } else {
                System.out.println("Input cannot be empty. Please try again.");
            }
        }
    }
    public static int getRangedInt(String prompt, int min, int max) {
        int input;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                scanner.nextLine();
                if (input >= min && input <= max) {
                    return input;
                } else {
                    System.out.println("Enter a number between " + min + " and " + max);
                }
            } else {
                System.out.println("INcorrect input, try again.");
                scanner.nextLine();
            }
        }
    }
    public static boolean getYNConfirm(String prompt) {
        String input = getRegExString(prompt, "[YyNn]");
        return input.equalsIgnoreCase("Y");
    }
}
