import java.io.IOException;
import java.util.Scanner;

public class OptionB {

    private static final Scanner reader = new Scanner(System.in);
    private static final Menu optionBMenu = new Menu();
    private static final String optionBBanner = "option b banner";
    private static final String optionA = "option a";
    private static final String optionB = "option b";
    private static final String optionC = "option c";
    private static final String optionD = "option d";

    public static void gotoOptionBMenu() throws IOException {
        Menu.drawMenu(optionBMenu.charsTitle,
                optionBMenu.charsBanner,
                optionBMenu.charsRow,
                Menu.TITLE,
                optionBBanner,
                Menu.setOptionNames(optionA, optionB, optionC, optionD),
                Menu.setOptionNumbers('1', '2', '3', '0'), // TODO these chars should be set elsewhere
                Menu.width); // 0 exits

        System.out.print("Enter your choice here: ");
        int userOptionBChoice = reader.nextInt();

        // TODO need a while loop to catch entries < 0 or > 3 (see line 46 in Main.java)
        while (userOptionBChoice < 0 || userOptionBChoice > 3) {
        if (userOptionBChoice == 0) {
            Main.goToMainMenu();
        } else if (userOptionBChoice == 1) {
            OptionA.gotoOptionAMenu();
        } else if (userOptionBChoice == 2) {
            gotoOptionBMenu();
        } else if (userOptionBChoice == 3) {
            OptionC.gotoOptionCMenu();
        } else {
            Main.goToMainMenu();
        }
         }
    }
}
