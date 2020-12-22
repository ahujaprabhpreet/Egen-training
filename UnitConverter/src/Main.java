import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        UnitConverter uc = new UnitConverter();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value in feet(int): ");

        System.out.println("Converted value in cm: " + uc.ftToCm(Integer.parseInt(input.next())));

        System.out.println("Enter the value in feet(double): ");

        System.out.println("Converted value in cm: " + uc.ftToCm(Double.parseDouble(input.next())));

        input.close();

    }
}
