import java.util.Scanner;
import mypackages.areaPac;
public class Area {
    public static void main(String[] args) {
        int choice=-1;  // variable to store user's choice
        Scanner sc = new Scanner(System.in);
        areaPac a = new areaPac();
        do {
            System.out.println("----MENU ----");
            System.out.println("1. Area of Square");
            System.out.println("2. Area of Rectangle");
            System.out.println("3. Area of Circle");
            System.out.println("4. Area of Triangle");
            System.out.println("5. For exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();                
            switch (choice) { 
                case 1: {
                    System.out.println("Enter the Side of Square: ");
                    int side = sc.nextInt();
                    int a1 = a.area(side);
                    System.out.println("Area of Square: " + a1);
                }break;
                case 2: {
                    System.out.println("Enter the Length and Width of Rectangle: ");
                    int length = sc.nextInt();
                    int width = sc.nextInt();
                    int a2 = a.area(length, width);
                    System.out.println("Area of Rectangle: " + a2);
                } break;
                case 3: {
                    System.out.println("Enter the Radius of Circle: ");
                    double radius = sc.nextDouble();
                    double a3= a.area(radius);
                    System.out.println("Area of Circle: " + a3);
                }break;
                case 4: {
                    System.out.println("Enter all the three lenghts of the triangle: ");
                    double side1 = sc.nextDouble();
                    double side2 = sc.nextDouble();
                    double side3 = sc.nextDouble();
                    double a4 = a.area(side1, side2, side3);
                    System.out.println("Area of Triangle: " + a4);
                }break;
                case 5: {
                    System.out.println("Exiting the program...");
                }break;
                default: {
                    System.out.println("Invalid choice! Please try again.");
                }
        } 
        }while (choice != 5);
    }
}