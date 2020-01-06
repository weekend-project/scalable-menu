import java.util.Scanner;

public class NewGame {
    private char cornerChar;
    private char outsideChar;
    private char inCharLeft;
    private char inCharRight;
    private String title;
    private String banner;
    private String optionName;
    private int optionNum;
    private int width;

    public NewGame(char cornerChar, char outsideChar, String title, String banner, int width) {
        this.cornerChar = cornerChar;
        this.outsideChar = outsideChar;
        this.title = title;
        this.banner = banner;
        this.width = width;
        Menu.mainMenu(cornerChar, outsideChar, title, banner, width);
    }

    public void getNewGame() throws InterruptedException {
        Scanner reader = new Scanner(System.in);
        Menu.mainMenu(cornerChar,outsideChar,title,"species select",width);
        System.out.println();
        Thread.sleep(1000);
        System.out.print("Pick your species! ");
        System.out.println();
        int userChoice = reader.nextInt();
        System.out.println(userChoice);

    }
}
