package amazinggame;
import jcurses.system.*;

public class Room {
   public Player player;

   Room(Player player) {
      this.player = player;
      Player player1 = player;
   }
   int printedTileXCoordinate = 0;
   int printedTileYCoordinate = 0;

   public static String[][] currentRoomInfo =
           {{"|", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "|"},
                   {"|", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "|"},
                   {"|", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "|"},
                   {"|", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "|"},
                   {"|", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "|"},
                   {"|", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "|"},
                   {"|", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "|"},
                   {"|", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "|"},
                   {"|", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "|"},
                   {"|", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "|"},
                   {"|", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "|"},
                   {"|", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "|"},
                   {"|", "-", "-", "-", "-", "-", "+", "-", "-", "-", "-", "-", "|"},
                   {" ", " ", " ", " ", "|", ".", ".", ".", "|", " ", " ", " ", " "},
                   {" ", " ", " ", " ", "|", "(", ".", "(", "|", " ", " ", " ", " "},
                   {" ", " ", " ", " ", "|", ".", ".", ".", "|", " ", " ", " ", " "},
                   {" ", " ", " ", " ", "|", "-", "=", "-", "|", " ", " ", " ", " "},
                   {" ", " ", " ", " ", "|", ".", "@", ".", "|", " ", " ", " ", " "},
                   {" ", " ", " ", " ", "|", "-", "+", "-", "|", " ", " ", " ", " "},
                   {" ", " ", " ", " ", "|", ".", ".", ".", "|", " ", " ", " ", " "},
                   {" ", " ", " ", " ", "|", ".", ".", ".", "|", " ", " ", " ", " "},
                   {" ", " ", " ", " ", "|", ".", ".", ".", "|", " ", " ", " ", " "},
                   {" ", " ", " ", " ", "|", "-", "-", "-", "|", " ", " ", " ", " "},};

   public void printRoom() {
      do {
         printedTileXCoordinate = 0;
         do {
            if (printedTileXCoordinate == player.playerCoordinateX && printedTileYCoordinate == player.playerCoordinateY) {
               Toolkit.printString("@", printedTileXCoordinate + 10, printedTileYCoordinate + 10, new CharColor(CharColor.BLACK, CharColor.YELLOW));
            }
            else if (tileIsLit(player.playerCoordinateX, player.playerCoordinateY, printedTileXCoordinate, printedTileYCoordinate, 2) && player.torchAmount > 0){
               printLitTile();

               }
            else
               Toolkit.printString(String.valueOf(currentRoomInfo[printedTileYCoordinate][printedTileXCoordinate]), printedTileXCoordinate + 10, printedTileYCoordinate + 10, new CharColor(CharColor.BLACK, CharColor.WHITE));
            printedTileXCoordinate++;
         } while (printedTileXCoordinate < currentRoomInfo[0].length);
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

   private void printLitTile() {
      Toolkit.printString(String.valueOf(currentRoomInfo[printedTileYCoordinate][printedTileXCoordinate]), printedTileXCoordinate + 10, printedTileYCoordinate + 10, new CharColor(CharColor.BLACK, CharColor.YELLOW));

   }
}