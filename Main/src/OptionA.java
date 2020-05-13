import java.io.IOException;
import java.util.Scanner;

public class OptionA {

    private static final Scanner reader = new Scanner(System.in);
    private static final Menu optionAMenu = new Menu();
    private static final String optionABanner = "option a banner";
    private static final String optionA = "option a";
    private static final String optionB = "option b";
    private static final String optionC = "option c";
    private static final String optionD = "option d";

    public static void gotoOptionAMenu() throws IOException {
        Menu.drawMenu(optionAMenu.charsTitle,
                optionAMenu.charsBanner,
                optionAMenu.charsRow,
                Menu.TITLE,
                optionABanner,
                Menu.setOptionNames(optionA, optionB, optionC, optionD),
                Menu.setOptionNumbers('1', '2', '3', '0'), // TODO these chars should be set elsewhere
                Menu.width); // 0 exits

        System.out.print("Enter your choice here: ");
        int userOptionAChoice = reader.nextInt();


        // TODO need a while loop to catch entries < 0 or > 3 (see line 46 in Main.java)
         while (userOptionAChoice < 0 || userOptionAChoice > 3) {
        if (userOptionAChoice == 0) {
            Main.goToMainMenu();
        } else if (userOptionAChoice == 1) {
            gotoOptionAMenu();
        } else if (userOptionAChoice == 2) {
            OptionB.gotoOptionBMenu();
        } else if (userOptionAChoice == 3) {
            OptionC.gotoOptionCMenu();
        } else {
            Main.goToMainMenu();
        }
         }
    }
}
