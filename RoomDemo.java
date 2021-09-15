import java.util.Scanner;

public class RoomDemo
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      String roomName = ""; //to hold the name of the room
      int shadeChoice, sDE = 0; // used to hold the shade information
      double len, wid = 0.0; //used to hold information of the room dimensions
      
      
      System.out.print("Please enter the name of the room: ");
      roomName = keyboard.nextLine();
      
      //creating the object in memory
      RoomClass one = new RoomClass(roomName);
      
      //setting up the length and width of the room
      System.out.print("Please enter the length of the room (in feet): ");
      len = keyboard.nextDouble();
      one.setLength(len);
      System.out.print("Please enter the width of the room (in feet): ");
      wid = keyboard.nextDouble();
      one.setWidth(wid);
      
      //Getting the information for the shade amount
      System.out.print("What is the amount of shade that this room receives?");
      System.out.print("\n\t1.Little Shade");
      System.out.print("\n\t2.Moderate Shade");
      System.out.print("\n\t3.Abundant Shade");
      System.out.print("\nPlease select from the options above: ");
      shadeChoice = keyboard.nextInt();
      one.setShade(shadeChoice);
      
      //Displaying the calculated data to the user
      System.out.print("Room Name: " + one.getRoomName());
      System.out.print("\nRoom Area (in square feet): " + one.getArea());
      System.out.print("\nAmount of Shade: " + one.getShadeName());
      System.out.print("\nBTUs Per Hour needed: " + one.getBtu());
      }
}