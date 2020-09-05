import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hourDegrees = scanner.nextInt();
        int remainingMin;
        int minDegrees;

        /*
         *  your code goes here
         */
         remainingMin = hourDegrees % 30;
         minDegrees = remainingMin * 12;
         System.out.print(minDegrees);

        // closing the scanner object
        scanner.close();
    }
}