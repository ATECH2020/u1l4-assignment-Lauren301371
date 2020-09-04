import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
        int seconds = scanner.nextInt();
        int hours;
        int minutes;

        //Your code goes here
        hours = seconds / 3600;
        minutes = seconds / 60;

        System.out.println(hours + " " + minutes);

        // closing the scanner object
        scanner.close();
    }
}