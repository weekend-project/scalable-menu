import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static Scanner reader = new Scanner(System.in);
    private static Menu main = new Menu();
    private static int userMainChoice;

    public static void main(String[] args) throws IOException {
        do {
            goToMainMenu();
        } while (userMainChoice != 0);
    }

    public static void goToMainMenu() throws IOException {
        /*
            When calling drawMenu, use Menu.java to change some parameters, and pass in custom parameters when calling
            setOptionNames(<custom params here>) and setOptionNumbers(<custom params here>).
         */

        String banner = "banner title here";
        String optionA = "option a";
        String optionB = "option b";
        String optionC = "option c";
        String optionD = "option d";


        Menu.drawMenu(main.charsTitle, main.charsBanner, main.charsRow, Menu.TITLE, banner,
                Menu.setOptionNames(optionA, optionB, optionC, optionD),
                Menu.setOptionNumbers('1', '2', '3', '0'), Menu.width); // 0 to exit

        System.out.print("Enter your choice here: ");
        userMainChoice = reader.nextInt();
        System.out.println();

        if (userMainChoice == 0)
            System.out.println("Goodbye!");

        while (userMainChoice < 0 || userMainChoice > 3) {
            Menu.drawMenu(main.charsTitle, main.charsBanner, main.charsRow, Menu.TITLE, banner,
                    Menu.setOptionNames(optionA, optionB, optionC, optionD),
                    Menu.setOptionNumbers('1', '2', '3', '0'), 60);
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


