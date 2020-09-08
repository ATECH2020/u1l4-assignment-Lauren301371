import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hourDegrees = scanner.nextInt();

        //Creates variables for remainder and degrees of minute hand
        int remainingMin;
        int minDegrees;

        //Gets remaining degrees (how much the minute hand turned since the start of the hour) by dividing by the number of degrees of each hour in a clock
         remainingMin = hourDegrees % 30;

        //Multiplies remaining degrees by 12 to scale it up to fit the clock
         minDegrees = remainingMin * 12;

        //Prints out degrees of the minute hand
         System.out.print(minDegrees);

        //Closing the scanner object
        scanner.close();
    }
}