package amazinggame;

import amazinggame.Room;

public class Player {
    private Game game;
    Player(Game game) {
        this.game = game;
    }
    private Room room;
    Player(Room room) {
        this.room = room;
    }

    public boolean isAlive = true;
    public int torchAmount = 3;
    int playerCoordinateY = 6;
    int playerCoordinateX = 6;
    int playerWantsToMoveCoordinateX = 6;
    int playerWantsToMoveCoordinateY = 6;

    public void movePlayer() {
        determineWherePlayerWillMove();
        if (determineIfPlayerCanMove()) {
            playerCoordinateX = playerWantsToMoveCoordinateX;
            playerCoordinateY = playerWantsToMoveCoordinateY;
        }
        else {
            playerWantsToMoveCoordinateX = playerCoordinateX;
            playerWantsToMoveCoordinateY = playerCoordinateY;
        }
    }

    private boolean determineIfPlayerCanMove() {
        if (room.currentRoomInfo[playerWantsToMoveCoordinateY][playerWantsToMoveCoordinateX] == '.')
            return true;
        else
            return false;
    }

    private void determineWherePlayerWillMove() {
        if (game.charInput == '7' || game.charInput == '8' || game.charInput == '9')
            playerWantsToMoveCoordinateY--;
        else if (game.charInput == '1' || game.charInput == '2' || game.charInput == '3')
            playerWantsToMoveCoordinateY++; //origin is at top left
        if (game.charInput == '1' || game.charInput == '4' || game.charInput == '7')
            playerWantsToMoveCoordinateX--;
        else if (game.charInput == '3' || game.charInput == '6' || game.charInput == '9')
            playerWantsToMoveCoordinateX++;
    }
}

