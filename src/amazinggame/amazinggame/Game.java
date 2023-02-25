package amazinggame;

import jcurses.system.*;

public class Game {

    char charInput = '!';
    public void receiveInput() {
            InputChar input = Toolkit.readCharacter();
            charInput = input.getCharacter();
        }
}
