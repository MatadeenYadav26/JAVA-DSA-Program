package Class3;

import java.util.Scanner;

public class switch_case {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter a Day: ");
//        int day = sc.nextInt();
//
//        switch(day){
//            case 1:case 8:  // multiple cases can be used at once
//                System.out.println("Day 1 : Sunday");
//                break;
//            case 2 :
//                System.out.println("Day 2 : Monday");
//                break;
//            case 3 :
//                System.out.println("Day 3 : Tuesday");
//                break;
//            case 4:
//                System.out.println("Day 4 : Wednesday");
//                break;
//            case 5:
//                System.out.println("Day 5 : Thursday");
//                break;
//            case 6:
//                System.out.println("Day 6 : Friday");
//                break;
//            case 7:
//                System.out.println("Day 7 : Saturday");
//                break;
//            default:
//                System.out.println("Invalid Day");
//        }


// For switchcase only : Primitive Datatypes , Enum  works inside SwitchCase.
// you can use multiple cases at once too.



// If-else with : Logical Operators:

    System.out.println("Enter Time: ");
    int time = sc.nextInt();

//    if(time >=10 && time <=20){
//        System.out.println("Office is open!");
//    }
//    else{
//        System.out.println("Office is closed!");
//    }


if(time == 12 || time == 18){
    System.out.println("Time for Snacks");
}
else {
    System.out.println("Time to Work");
}


    }
}
