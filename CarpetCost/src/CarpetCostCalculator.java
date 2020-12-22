import java.util.Scanner;

public class CarpetCostCalculator {

    public static void main(String[] args){

        RoomDimension room = new RoomDimension();
        RoomCarpet carpet = new RoomCarpet();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Room Length: ");
        room.setRoomLength(input.nextDouble());
        System.out.println("Enter the Room Width: ");
        room.setRoomWidth(input.nextDouble());
        System.out.println("Enter the Cost per Sq ft of the carpet");
        carpet.setCostPerSqFt(input.nextDouble());

        System.out.println("The cost of the carpet is: " + carpet.calculateCost(room));

        input.close();
    }


}


