package amazinggame;
import jcurses.system.*;
import jcurses.util.Rectangle;


class Main {
    public static void main(String[] args) throws InterruptedException {
        //Toolkit.clearScreen(new CharColor(CharColor.BLACK, CharColor.BLACK));
        InputChar input  = Toolkit.readCharacter();
        String stringInput = input.toString();
        Toolkit.printString(stringInput, 10, 10,new CharColor(CharColor.WHITE, CharColor.BLACK));
        //Rectangle rectangle = new Rectangle(0, 0, 30, 10);
        //Toolkit.printString("Hello", 0, 0,new CharColor(CharColor.MAGENTA, CharColor.GREEN));
        //Toolkit.drawRectangle(rectangle, new CharColor(CharColor.RED, CharColor.CYAN));
        //Game game = new Game();
        //Room.resetRoom();
        //game.intro();
        //Room.printRoom();
       //Player.movePlayer();
    }
}
/*
dungeon / cavern for player to explore
player is a dwarf
player mines ores to sell
can sell and buy at a shop
potions
enemies would be typical fantasy enemies trolls goblins etc
player has spells
player is wizard
exp -> level -> grow your beard -> more powerful
player has limited inventory to hold ores
player has to manage torches in order to not get lost in the darkness
limited number of torches, only can be bought
if torches run out they will be attacked (like don't starve) by invisible enemies in the dark
 */