import java.io.IOException;
import java.util.Scanner;

public class OptionA {

    private static Scanner reader = new Scanner(System.in);
    private static Menu optionAMenu = new Menu();
    private static String optionABanner = "option A banner";
    private static String optionA = "option a";
    private static String optionB = "option b";
    private static String optionC = "option c";
    private static String optionD = "option d";

    public static void gotoOptionAMenu() throws IOException {
        Menu.drawMenu(optionAMenu.charsTitle, optionAMenu.charsBanner, optionAMenu.charsRow, Menu.TITLE, optionABanner,
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
        gotoOptionAMenu();
    }

    public static void gotoWater() throws IOException {
        gotoOptionAMenu();
    }

    public static void gotoMilk() throws IOException {
        gotoOptionAMenu();
    }


}
