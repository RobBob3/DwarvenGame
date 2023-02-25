package amazinggame;
import jcurses.system.*;
public class Room {
   private Player player;
   Room(Player player) {
      this.player = player;
   }
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
                   {"|", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "|"}};
   public static void resetRoom() {
      currentRoomInfo =
              new String[][]{{"|", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "|"},
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
                      {"|", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "|"}};
   }

   public void printRoom() {
      int printedTileXCoordinate = 0;
      int printedTileYCoordinate = 0;
      do {
         printedTileXCoordinate = 0;
         do {
            if (printedTileXCoordinate == player.playerCoordinateX && printedTileYCoordinate == player.playerCoordinateY) {
               Toolkit.printString("@", printedTileXCoordinate + 10, printedTileYCoordinate + 10, new CharColor(CharColor.BLACK, CharColor.GREEN));
               printedTileXCoordinate++;
            }
            else {
               Toolkit.printString(currentRoomInfo[printedTileYCoordinate][printedTileXCoordinate], printedTileXCoordinate + 10, printedTileYCoordinate + 10, new CharColor(CharColor.BLACK, CharColor.GREEN));
               printedTileXCoordinate++;
            }
         } while (printedTileXCoordinate < currentRoomInfo.length);
         printedTileYCoordinate++;
      } while (printedTileYCoordinate < currentRoomInfo.length);
   }
}