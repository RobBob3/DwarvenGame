package amazinggame;
import jcurses.system.*;
public class Room {
   private Player player;
   Room(Player player) {
      this.player = player;
   }
   public static char[][] currentRoomInfo =
           {{'|', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '|'},
                   {'|', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '|'},
                   {'|', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '|'},
                   {'|', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '|'},
                   {'|', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '|'},
                   {'|', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '|'},
                   {'|', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '|'},
                   {'|', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '|'},
                   {'|', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '|'},
                   {'|', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '|'},
                   {'|', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '|'},
                   {'|', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '|'},
                   {'|', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '|'}};
   public static void resetRoom() {
      currentRoomInfo =
              new char[][]{{'|', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '|'},
                      {'|', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '|'},
                      {'|', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '|'},
                      {'|', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '|'},
                      {'|', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '|'},
                      {'|', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '|'},
                      {'|', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '|'},
                      {'|', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '|'},
                      {'|', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '|'},
                      {'|', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '|'},
                      {'|', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '|'},
                      {'|', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '|'},
                      {'|', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '|'}};
   }

   public void printRoom() {
      int printedTileXCoordinate = 0;
      int printedTileYCoordinate = 0;
      do {
         printedTileXCoordinate = 0;
         do {
            if (printedTileXCoordinate == player.playerCoordinateX && printedTileYCoordinate == player.playerCoordinateY) {
               Toolkit.printString("@", printedTileXCoordinate + 10, printedTileYCoordinate + 10, new CharColor(CharColor.BLACK, CharColor.GREEN));
            }
            else if (tileIsLit(player.playerCoordinateX, player.playerCoordinateY, printedTileXCoordinate, printedTileYCoordinate, 2)){
               Toolkit.printString(String.valueOf(currentRoomInfo[printedTileYCoordinate][printedTileXCoordinate]), printedTileXCoordinate + 10, printedTileYCoordinate + 10, new CharColor(CharColor.BLACK, CharColor.GREEN));
            }
            else
               Toolkit.printString(String.valueOf(currentRoomInfo[printedTileYCoordinate][printedTileXCoordinate]), printedTileXCoordinate + 10, printedTileYCoordinate + 10, new CharColor(CharColor.BLACK, CharColor.WHITE));
            printedTileXCoordinate++;
         } while (printedTileXCoordinate < currentRoomInfo.length);
         printedTileYCoordinate++;
      } while (printedTileYCoordinate < currentRoomInfo.length);
   }

   private boolean tileIsLit(int lightSourceX, int lightSourceY, int printedTileX, int printedTileY, int lightDistance) {
      if (printedTileX <= lightSourceX + lightDistance && printedTileX >= lightSourceX - lightDistance) {
         if (printedTileY <= lightSourceY + lightDistance && printedTileY >= lightSourceY - lightDistance)
            return true;
         else
            return false;
      }
      else
         return false;
   }
}