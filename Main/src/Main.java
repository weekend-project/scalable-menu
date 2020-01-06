import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner reader = new Scanner(System.in);
        int userSelect = -1;
        while (userSelect != 0) {
            Menu.mainMenu('+', '|', "world war of ants", "main menu", 60);
            System.out.println();
            System.out.print("Type a number and press Enter: ");
            userSelect = reader.nextInt();
            if (userSelect == 0) {
                System.out.println();
                System.out.println("Goodbye!");
            } else if (userSelect == 1) {
                //TODO create and call NewGame class
                NewGame game = new NewGame('+', '|', "word war of ants", "new game", 50);
                game.getNewGame();
            } else if (userSelect == 2) {
                //TODO create and call HowToPlay class
            } else if (userSelect == 3) {
                //TODO create and call Help class
            }

        }


    }


}
