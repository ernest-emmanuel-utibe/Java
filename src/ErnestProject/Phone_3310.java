package ErnestProject;

import java.util.Scanner;

public class Phone_3310 {
        public static final Scanner input = new Scanner(System.in);
        private static String name;
        public static void setName(String name) { Phone_3310.name = name; }
        public static String getName() {return  name; }

        public static void mainMenu() {
            System.out.println("+                          |");
            System.out.println("+                          |");
            System.out.printf("+       WELCOME %S          |%n", getName());
            System.out.println("+                          |");
            System.out.println("+                          |\n");
            System.out.println("""
                    Phone Menu
                    1. PhoneBook
                    2. Messages
                    3. Chat
                    4. Call register
                    5. Tones
                    6. Settings
                    7. Call divert
                    8. Games
                    9. Calculator
                    10.Reminders
                    11.Clock
                    12.Profiles
                    13.Sim services
                    """);
            System.out.println("Press any number to access the Phone Menu");
            int phoneMenu = input.nextInt();

            if (phoneMenu >= 1 && phoneMenu <= 13) {
                switch (phoneMenu) {
                    case 1:
                        if (phoneMenu == 1) {
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

                            System.out.println("press 1 - 10 to open PhoneBook or enter 99 to go back: ");
                            int phoneBook = input.nextInt();

                            if (phoneBook >= 1 && phoneBook <= 10) {
                                switch (phoneBook) {
                                    case 1:
                                        System.out.println("Search");
                                        System.out.println("There is nothing to search for here gents and ladies");
                                }
                                switch (phoneBook) {
                                    case 2:
                                        System.out.println("Service numbers");
                                        System.out.println("Empty");
                                }
                                switch (phoneBook) {
                                    case 3:
                                        System.out.println("Add name");
                                }
                                switch (phoneBook) {
                                    case 4:
                                        System.out.println("Erase");
                                }
                                switch (phoneBook) {
                                    case 5:
                                        System.out.println("Edit");
                                }
                                switch (phoneBook) {
                                    case 6:
                                        System.out.println("Assign tone");
                                }
                                switch (phoneBook) {
                                    case 7:
                                        System.out.println("Send an invitation card");
                                }
                                switch (phoneBook) {
                                    case 8:
                                        System.out.println("""
                                                Options
                                                1: Type of view
                                                2: Memory status
                                                """);
                                        int options = input.nextInt();
                                        if (options >= 1 && options <= 2)
                                            switch (options) {
                                                case 1:
                                                    System.out.println("Type of view");
                                            }
                                        break;
                                    case 2:
                                        System.out.println("Memory status");
                                        break;
                                    case 9:
                                        System.out.println("Speed dials");
                                        break;
                                    case 10:
                                        System.out.println("Voice tags");
                                        break;
                                }
                            }
                        }
                        break;
                }
            if (phoneMenu >= 1 && phoneMenu <= 13) {
                switch (phoneMenu) {
                    case 2:
                        if (phoneMenu == 2) {
                            System.out.println("""
                                    Messages
                                    1: Write messages
                                    2: Inbox
                                    3: Outbox
                                    4: Picture messages
                                    5: Templates
                                    6: Smileys
                                    7: Message settings
                                    8: Info service
                                    9: Voice mailbox
                                    10: Service command editor
                                    """);
                            System.out.println("Press 1 - 10 to open messages: ");
                            int messages = input.nextInt();
                            if (messages >= 1 && messages <= 10) {
                                switch (messages) {
                                    case 1:
                                        System.out.println("Type a message");
                                        System.out.println("_________________");
                                    case 2:
                                        System.out.println("You have nothing in your inbox");
                                    case 3:
                                        System.out.println("Empty");
                                    case 4:
                                        System.out.println("Picture messages are empty");
                                    case 5:
                                        System.out.println("Empty");
                                    case 6:
                                        System.out.println(";) :) :( ;(");
                                    case 7:
                                       switch (messages) {
                                           case 7:
                                            System.out.println("""
                                                    Message settings
                                                    1: Set 1
                                                        1. Message centre number
                                                        2. Messages sent as
                                                        3. Message validity
                                                    2: Common
                                                        1. Delivery reports
                                                        2. Reply via same centre
                                                        3. Character support """);
                                       }
                                       break;

                                    case 8:
                                        System.out.println("Call this number +126538984 for info services");
                                        break;
                                    case 9:
                                        System.out.println("Voice mail box number: +245388649467");
                                        break;
                                    case 10:
                                        System.out.println("Shey you no wan wise habi. I wonder why you dey find service command editor");
                                        break;


//                                    if (chat >= 1 && chat <= 13) {
//                                        switch (chat) {
//
//                                        }
                                }
                            }
                        }
                }
            }
            }
        }
}