import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int class1 = scanner.nextInt();
        int class2 = scanner.nextInt();
        int class3 = scanner.nextInt();

        int desks1;
        int desks2;
        int desks3;
        int remainder1;
        int remainder2;
        int remainder3;
        int total;
        /*
         *  your code goes here
         */
         desks1 = class1 / 2;
         desks2 = class2 / 2;
         desks3 = class3 / 2;

         remainder1 = class1 % 2;
         remainder2 = class2 % 2;
         remainder3 = class3 % 2;

         desks1 += remainder1;
         desks2 += remainder2;
         desks3 += remainder3;

         total = desks1 + desks2 + desks3;
         System.out.print(total);
        // closing the scanner object
        scanner.close();
    }
}