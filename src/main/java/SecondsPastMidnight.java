import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
        int seconds = scanner.nextInt();

        //Creates variables for hours and minutes
        int hours;
        int minutes;

        //Divides seconds by # of seconds in an hour
        hours = seconds / 3600;

        //Divides seconds by # of seconds in a min.
        minutes = seconds / 60;

        //Prints out hours and minutes past midnight
        System.out.print(hours + " " + minutes);

        //Closing the scanner object
        scanner.close();
    }
}