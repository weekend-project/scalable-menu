import java.io.IOException;
import java.util.Scanner;

public class OptionC {

    private static Scanner reader = new Scanner(System.in);
    private static Menu optionCMenu = new Menu();
    private static String optionCBanner = "option c banner";
    private static String optionA = "option a";
    private static String optionB = "option b";
    private static String optionC = "option c";
    private static String optionD = "option d";

    public static void gotoOptionCMenu() throws IOException {
        Menu.drawMenu(optionCMenu.charsTitle, optionCMenu.charsBanner, optionCMenu.charsRow, Menu.TITLE, optionCBanner,
                Menu.setOptionNames(optionA, optionB, optionC, optionD),
                Menu.setOptionNumbers('1', '2', '3', '0'), Menu.width); // 0 exits
        System.out.print("Enter your choice here: ");
        int userVolChoice = reader.nextInt();

        if (userVolChoice == 0) {
            Main.goToMainMenu();
        } else if (userVolChoice == 1) {
            gotoFlour();
        } else if (userVolChoice == 2) {
            gotoWater();
        } else if (userVolChoice == 3) {
            gotoMilk();
        } else {
            Main.goToMainMenu();
        }
    }

    public static void gotoFlour() throws IOException {
        gotoOptionCMenu();
    }

    public static void gotoWater() throws IOException {
        gotoOptionCMenu();
    }

    public static void gotoMilk() throws IOException {
        gotoOptionCMenu();
    }

}
