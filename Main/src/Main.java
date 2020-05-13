import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static final Scanner reader = new Scanner(System.in);
    private static final Menu main = new Menu();
    private static int userMainChoice;

    public static void main(String[] args) throws IOException {
        do {
            goToMainMenu();
        } while (userMainChoice != 0);
    }

    public static void goToMainMenu() throws IOException {

        String banner = "banner title here";
        String optionA = "option a";
        String optionB = "option b";
        String optionC = "option c";
        String optionD = "option d";

        /*
            When calling drawMenu, use Menu.java to change some parameters, and pass in custom parameters when calling
            setOptionNames(<custom params here>) and setOptionNumbers(<custom params here>).
        */

        Menu.drawMenu(main.charsTitle,
                main.charsBanner,
                main.charsRow,
                Menu.TITLE,
                banner,
                Menu.setOptionNames(optionA, optionB, optionC, optionD),
                Menu.setOptionNumbers('1', '2', '3', '0'), // TODO these chars should be set elsewhere
                Menu.width); // 0 to exit

        System.out.print("Enter your choice here: ");
        userMainChoice = reader.nextInt();
        System.out.println();

        if (userMainChoice == 0) {
            System.out.println("Goodbye!");
            System.exit(0);
        }

        while (userMainChoice < 0 || userMainChoice > 3) {
            Menu.drawMenu(main.charsTitle,
                    main.charsBanner,
                    main.charsRow,
                    Menu.TITLE,
                    banner,
                    Menu.setOptionNames(optionA, optionB, optionC, optionD),
                    Menu.setOptionNumbers('1', '2', '3', '0'), // TODO these chars should be set elsewhere
                    Menu.width);

            System.out.print("You must enter a valid option, try again: ");
            userMainChoice = reader.nextInt();
            System.out.println();
        }

        if (userMainChoice == 1) {
            OptionA.gotoOptionAMenu();
        } else if (userMainChoice == 2) {
            OptionB.gotoOptionBMenu();
        } else if (userMainChoice == 3) {
            OptionC.gotoOptionCMenu();
        }
        goToMainMenu();
    }
}


