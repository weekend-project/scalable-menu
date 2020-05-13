import java.io.IOException;
import java.util.Scanner;

public class OptionC {

    private static final Scanner reader = new Scanner(System.in);
    private static final Menu optionCMenu = new Menu();
    private static final String optionCBanner = "option c banner";
    private static final String optionA = "option a";
    private static final String optionB = "option b";
    private static final String optionC = "option c";
    private static final String optionD = "option d";

    public static void gotoOptionCMenu() throws IOException {
        Menu.drawMenu(optionCMenu.charsTitle,
                optionCMenu.charsBanner,
                optionCMenu.charsRow,
                Menu.TITLE,
                optionCBanner,
                Menu.setOptionNames(optionA, optionB, optionC, optionD),
                Menu.setOptionNumbers('1', '2', '3', '0'), // TODO these chars should be set elsewhere
                Menu.width); // 0 exits

        System.out.print("Enter your choice here: ");
        int userOptionCChoice = reader.nextInt();

        // TODO need a while loop to catch entries < 0 or > 3 (see line 46 in Main.java)
        while (userOptionCChoice < 0 || userOptionCChoice > 3) {
        if (userOptionCChoice == 0) {
            Main.goToMainMenu();
        } else if (userOptionCChoice == 1) {
            OptionA.gotoOptionAMenu();
        } else if (userOptionCChoice == 2) {
            OptionB.gotoOptionBMenu();
        } else if (userOptionCChoice == 3) {
            gotoOptionCMenu();
        } else {
            Main.goToMainMenu();
        }
        }
    }
}
