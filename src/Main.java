import java.util.ArrayList;
import java.util.List;
public class Main {
    private static List<String> itemList = new ArrayList<>();

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            showMenu();
            char userChoice = SafeInput.getRegExString("Choose an option (A, D, I, P, Q): ", "[AaDdIiPpQq]").charAt(0);
            switch (userChoice) {
                case 'A':
                case 'a':
                    addItem();
                    break;
                case 'D':
                case 'd':
                    deleteItem();
                    break;
                case 'I':
                case 'i':
                    break;
                case 'P':
                case 'p':
                    printList();
                    break;
                case 'Q':
                case 'q':
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
    }

    private static void showMenu() {
        System.out.println("\nCurrent List: ");
        printList();
        System.out.println("\nMenu:");
        System.out.println("A - Add an item");
        System.out.println("D - Delete an item");
        System.out.println("I - Insert an item");
        System.out.println("P - Print the list");
        System.out.println("Q - Quit");
    }

    private static void addItem() {
        String item = SafeInput.getNonZeroLengthString("Enter an item to add: ");
        itemList.add(item);
        System.out.println("Item added.");
    }

    private static void deleteItem() {
        printList();
        int itemNumber = SafeInput.getRangedInt("How many itwms do you want to delete? ", 1, itemList.size());
        itemList.remove(itemNumber - 1); 
        System.out.println("Item is removed.");
    }

    private static void printList() {
        if (itemList.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            for (int i = 0; i < itemList.size(); i++) {
                System.out.println((i + 1) + ". " + itemList.get(i));
            }
        }
    }
}



