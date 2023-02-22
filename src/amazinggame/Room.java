package amazinggame;
import jcurses.system.*;
public class Room {
   static int previousPlayerX;
   static int previousPlayerY;
   public static String[][] currentRoomInfo =
           {{"-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                   {"|", "2", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "|"},
                   {"|", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "|"},
                   {"|", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "|"},
                   {"|", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "|"},
                   {"|", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "|"},
                   {"|", ".", ".", ".", ".", ".", "@", ".", ".", ".", ".", ".", "|"},
                   {"|", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "|"},
                   {"|", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "|"},
                   {"|", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "|"},
                   {"|", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "|"},
                   {"|", "1", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "|"},
                   {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}};;
   public static void resetRoom() {
      currentRoomInfo =
              new String[][]{{"|", "|", "|", "|", "|", "|", "|", "|", "|", "|", "|", "|", "|"},
                      {"|", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "|"},
                      {"|", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "|"},
                      {"|", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "|"},
                      {"|", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "|"},
                      {"|", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "|"},
                      {"|", ".", ".", ".", ".", ".", "@", ".", ".", ".", ".", ".", "|"},
                      {"|", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "|"},
                      {"|", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "|"},
                      {"|", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "|"},
                      {"|", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "|"},
                      {"|", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", ".", "|"},
                      {"|", "|", "|", "|", "|", "|", "|", "|", "|", "|", "|", "|", "|"}};
      previousPlayerX = 6;
      previousPlayerY = 6;
   }

   public static void printRoom() {
      int printedTileXCoordinate = 0;
      int printedTileYCoordinate = 0;
      do {
         printedTileXCoordinate = 0;
         do {
            Toolkit.printString(currentRoomInfo[printedTileYCoordinate][printedTileXCoordinate], printedTileXCoordinate + 10, printedTileYCoordinate + 10, new CharColor(CharColor.BLACK, CharColor.GREEN));
            //System.out.print(currentRoomInfo[printedTileYCoordinate][printedTileXCoordinate] + " ");
            printedTileXCoordinate++;
         } while (printedTileXCoordinate < currentRoomInfo.length);
         printedTileYCoordinate++;
      } while (printedTileYCoordinate < currentRoomInfo.length);
      //Game.printDivider(currentRoomInfo.length * 2); //*2 because there is a space between every print on x axis
   }
}