import java.util.*;

public class caseStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float []arr = new float[5];
        System.out.println("Enter the Speed of 5 Bikers:");  //taking input for speeds of bikers 1 to 5
        for(int i=0;i<5;i++){
            System.out.print("Enter the Speed of Biker "+(i+1)+": ");
            arr[i] = sc.nextFloat();
        }
        float totalSpeed = 0;
        //calculating the average speed
        for(int i=0;i<5;i++){
            totalSpeed += arr[i];
        }  
        float avgSpeed = totalSpeed / 5;
        //printing the speed of all the bikes1
        for(int i=0;i<5;i++){
            System.out.println("The speed of Biker "+(i+1)+": " + arr[i]+" kmh");
        }  
        System.out.println("Average Speed of all 5 Bikers: " + avgSpeed+" kmh");
        //finding the qualifying racers
        for (int i = 0; i < 5; i++) {
            if (arr[i] >= avgSpeed) {
                System.out.println("The qualifing racers are: "+(i+1)+" with speed "+arr[i]+" kmh");
            }
        }
    }
}