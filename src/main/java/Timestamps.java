import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();

        //Creates variables for difference between timestamps
        int hours3;
        int minutes3;
        int seconds3;

        //Finds difference between each component of timestamps
          hours3 = hours2 - hours1;
          minutes3 = minutes2 - minutes1;
          seconds3 = seconds2 - seconds1;
          
        //Converts hours and minutes to seconds
          hours3 = hours3 * 3600;
          minutes3 = minutes3 * 60;

        //Adds total # of seconds
          seconds3 = hours3 + minutes3 + seconds3;

        //Prints out total # of seconds
          System.out.print(seconds3);

        //Closing the scanner object
        scanner.close();
    }
}