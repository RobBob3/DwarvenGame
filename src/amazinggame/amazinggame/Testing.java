package amazinggame;

import jcurses.system.*;

public class Testing {
    private Game game;
    Testing(Game game) {
        this.game = game;
    }
    public void printInput() {
        Toolkit.printString(String.valueOf(game.charInput), 0, 0, new CharColor(CharColor.GREEN, CharColor.MAGENTA));

    }
}
