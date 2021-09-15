import java.util.Scanner;

public class RoomClass
{
   private String name;
   private double length;
   private double width;
   
   int sdeChoice = 0;
   double multiplier, area = 0.0;
   double calcBtu = 0.0;
   String shadeName = "";
   
   
   //Room name setter and getter
   public RoomClass(String roomName)
   {
      name = roomName;
   }
   public void setRoomName(String roomName)
   {
      name = roomName;
   }
   public String getRoomName()
   {
      return name;
   }
   
   
   //private fields to hold the length and width. Contains setter and getter.
   public RoomClass()
   {
      length = 0.0;
      width = 0.0;
   }
   /* constructor sets the length field
   @param len
   */
   public void setLength(double len)
   {
      length = len;
   }
   /* constructor sets the width field
   @param wid
   */
   public void setWidth(double wid)
   {
      width = wid;
   }

   //Setting the string name for the shade type to return to the user
   public void setShade(int shade)
   {
      sdeChoice = shade;
   }
  
   public String getShadeName()
   {
     switch (sdeChoice) {
            case 1:
               shadeName = "Little Shade";
               break;
            case 2:
               shadeName = "Moderate Shade";
               break;
            case 3:
               shadeName = "Abundant Shade";
               break;
               }
 
      return shadeName;
   }
   
   //Setting the multiplier based upon the shade type of the house
   public void setmultiplier()
   {
     switch (sdeChoice) {
            case 1:
               multiplier = 1.15;
               break;
            case 2:
               multiplier = 1;
               break;
            case 3:
               multiplier = .90;
               break;
         }
    }
    
    //Used to calculate and return the area of the room
    public double getArea()
    {
      area = length * width;
      return area; 
    }
    
    //Used to apply the multiplier of shade to the area. Returns the BTU for the room.
    public double getBtu()
    {
      switch (sdeChoice) {
            case 1:
               multiplier = 1.15;
               break;
            case 2:
               multiplier = 1;
               break;
            case 3:
               multiplier = .90;
               break;
         }
      calcBtu = area * multiplier;
      return calcBtu;
    }
   
}