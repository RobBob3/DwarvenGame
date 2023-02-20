package amazinggame;

public class Game {
    public void intro() throws InterruptedException {
        System.out.println("Welcome, adventurer...");
        Thread.sleep(2000);
        System.out.println("...to your doom!!!");
        printDivider(25);
    }
    public static void printDivider(int dividerLength) {
        for (int i = 0; i < dividerLength; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
