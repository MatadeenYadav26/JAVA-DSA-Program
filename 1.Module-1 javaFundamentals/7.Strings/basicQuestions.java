package class7_Strings;

import java.util.Scanner;

public class basicQuestions {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter Last Name: ");
//        String lastName = sc.nextLine();
        String lastName = sc.next();

        System.out.println("Full Name: "+firstName+" "+lastName);

        // sc.next() vs sc.nextLine():

    }
}
