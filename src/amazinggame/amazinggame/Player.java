package amazinggame;

public class Player {
    Game game;
    Player(Game game) { this.game = game; }
    Room room;
    Player(Room room) { this.room = room; }

    public boolean isAlive = true;
    public final String TRAVERSABLE_TILES = ".+";
    public int torchAmount = 0;
    int playerCoordinateY = 14;
    int playerCoordinateX = 6;
    int playerWantsToMoveCoordinateX = playerCoordinateX;
    int playerWantsToMoveCoordinateY = playerCoordinateY;

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
        String tileToMove;
        tileToMove = String.valueOf(room.currentRoomInfo[playerWantsToMoveCoordinateY][playerWantsToMoveCoordinateX]);
        if (TRAVERSABLE_TILES.contains(tileToMove))
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

