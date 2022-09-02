import java.util.Scanner;

public class SpeedConverter {
            public static void main(String[] args) {
            printConversion(36.21);
            printConversion(-45.2);
        }
        public static void printConversion(double kilometersPerHour) {

            if (kilometersPerHour < 0) {
                System.out.println("Invalid Value");


            } else {
                double milesPerHour = 0;
                milesPerHour = Math.round(kilometersPerHour / 1.609);

                System.out.println(kilometersPerHour+"km/h=  "+milesPerHour+" "+"mi/h");
        }



    }
}
