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

        int hours3;
        int minutes3;
        int seconds3;

        /*
         *  your code goes here
         */
          hours3 = hours2 - hours1;
          minutes3 = minutes2 - minutes1;
          seconds3 = seconds2 - seconds1;
          
          hours3 = hours3 * 3600;
          minutes3 = minutes3 * 60;

          seconds3 = hours3 + minutes3 + seconds3;

          System.out.println(seconds3);
        // closing the scanner object
        scanner.close();
    }
}