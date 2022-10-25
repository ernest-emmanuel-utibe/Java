import java.util.Scanner;

public class Phone {
    private static Scanner scanner = new Scanner(System.in);
    public void menu() {
        System.out.println("""
                1 -> phoneBook
                2 -> messages
                8 -> settings
                0 -> Back to menu
                """);
        int menu = scanner.nextInt();
        switch (menu){
            case 1 -> phoneBook();
            case 2 -> messages();
            case 8 -> settings();
            case 0 -> menu();
        }
    }

    private void settings() {
        System.out.println("""
                1 -> phoneBook
                2 -> messages
                8 -> settings
                0 -> Back to menu
                """);
        int menu = scanner.nextInt();
        switch (menu){
            case 1 -> phoneBook();
            case 2 -> messages();
            case 8 -> settings();
            case 0 -> menu();
        }
    }

    private void messages() {
    }

    private void phoneBook() {
        System.out.println("""
                PhoneBook
                1. Search
                2. Service Numbers
                3. Add name
                4. Erase
                5. Edit
                6. Assign tone
                7. Send invitation card
                8. Options
                9. Voice tags
                """);
        int phoneBook = scanner.nextInt();
        switch(phoneBook){
            case 1 -> search();
            case 2 -> serviceNumber();
        }
    }

    private void serviceNumber() {
        System.out.println("""
                Your service number is 123456
                9 -> phoneBook
                99 -> menu
                """);
        int serviceNumber = scanner.nextInt();
        switch (serviceNumber){
            case 1 -> phoneBook();
            case 2 -> menu();
        }
    }

    private void search() {
    }
}
