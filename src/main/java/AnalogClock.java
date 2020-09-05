import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hourDegrees = scanner.nextInt();
        int hoursPassed;
        int remainingMin;
        int minDegrees;

        /*
         *  your code goes here
         */
         hoursPassed = hourDegrees / 30;
         remainingMin = hourDegrees % hoursPassed;
         minDegrees = remainingMin * 30;
         System.out.println(minDegrees);

        // closing the scanner object
        scanner.close();
    }
}