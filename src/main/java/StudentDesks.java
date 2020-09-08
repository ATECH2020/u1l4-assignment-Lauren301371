import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int class1 = scanner.nextInt();
        int class2 = scanner.nextInt();
        int class3 = scanner.nextInt();

        //Creates variables for desks and remainders
        int desks1;
        int desks2;
        int desks3;
        int remainder1;
        int remainder2;
        int remainder3;
        int total;

        //Divides # of students by people needed per desk
         desks1 = class1 / 2;
         desks2 = class2 / 2;
         desks3 = class3 / 2;

        //Gets # of remaining students
         remainder1 = class1 % 2;
         remainder2 = class2 % 2;
         remainder3 = class3 % 2;

        //Adds additional desks (if any) to total amount
         desks1 += remainder1;
         desks2 += remainder2;
         desks3 += remainder3;

        //Adds # of desks needed from each class
         total = desks1 + desks2 + desks3;

        //Prints out total desks needed
         System.out.print(total);

        //Closing the scanner object
        scanner.close();
    }
}