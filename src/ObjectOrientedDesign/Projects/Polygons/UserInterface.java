package ObjectOrientedDesign.Projects.Polygons;
import java.util.Scanner;

import static java.lang.Double.parseDouble;


public class UserInterface {
    public static void main (String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the type of polygon");
        System.out.println("If it is rectangle, please input r");
        String typeOfPolygon  = myObj.nextLine();

        switch (typeOfPolygon) {
            case "r" :
                System.out.println("Please input height");
                String height = myObj.nextLine();
                System.out.println("Please input width");
                String width = myObj.nextLine();
                Rectangle a = new Rectangle(parseDouble(height), parseDouble(width));
                System.out.println(a.area());
                System.out.println(a.perimeter());
               break;
        }

    }
}
