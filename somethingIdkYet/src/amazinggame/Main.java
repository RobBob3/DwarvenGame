package amazinggame;

class Main {
    public static void main(String[] args) throws InterruptedException {
        new MyFrame();
        MyFrame.
        Game game = new Game();
        Room.resetRoom();
        //game.intro();
       Room.printRoom();
       Player.movePlayer();
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