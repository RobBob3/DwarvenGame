package amazinggame;
import jcurses.system.*;


class Main {
    public static void main(String[] args) throws InterruptedException {
        Game game = new Game();
        Player player = new Player(game);
        Testing testing = new Testing(game);
        Room room = new Room(player);
        while(player.isAlive) {
            Toolkit.clearScreen(new CharColor(CharColor.BLACK, CharColor.BLACK));
            room.printRoom();
            Thread.sleep(20);
            game.receiveInput();
            player.movePlayer();
        }
        //Toolkit.printString(Game.receiveInput(), 0, 0,new CharColor(CharColor.MAGENTA, CharColor.GREEN));
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
two rooms, one for fighting enemies, one for buying from shop
 */