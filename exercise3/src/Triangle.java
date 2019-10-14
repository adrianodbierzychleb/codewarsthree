import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first angle: ");
        int angleOne = input.nextInt();
        if(angleOne>180 )
        {
            System.out.println("Error, angle cannot ba bigger than 180 in a triangle");
            System.exit(0);
        }
        System.out.println("Enter the second angle;");
        int angleTwo = input.nextInt();
        if(angleTwo>180)
        {
            System.out.println("Error, angle cannot ba bigger than 180 in a triangle");
            System.exit(0);
        }

        if((angleOne+angleTwo)>180)
        {
            System.out.println("Two angles cannot be greater than 180 degrees in a tringle");
            System.exit(0);
        }



        int angleThree = calculateAngle(angleOne, angleTwo);
        System.out.println("The calculated angle is : " +  angleThree);

    }

    public static int calculateAngle(int a, int b){
        int angle = 0;
        angle = 180 - a -b;

        return angle;

    }

}
