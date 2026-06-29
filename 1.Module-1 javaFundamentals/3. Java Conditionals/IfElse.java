package Class3;

public class IfElse {

    static void main(String[] args) {
       /* int age = 18;
        if(age > 18){
            System.out.println("You can vote!");
        }
        else {
            System.out.println("You cannot vote!");
        }*/


        // if-elseIf-else: Nesting Conditionals
//
//        int day = 9;
//        if (day == 2) {
//            System.out.println("It is day 2!");
//        }
//        else if (day == 3) {
//            System.out.println("It is day 3!");
//        } else if (day == 4) {
//            System.out.println("It is day 4!");
//        }
//        else{
//            System.out.println("It is other day!");
//        }


        // Given 3  number Find the Max. Number:-

//        int a = 12;
//        int b = 70;
//        int c = 9;
//        int d = 10;
//
//        if(a>b){
//            System.out.println("a is greater than b");
//            if (a>c){
//                System.out.println("a is greater than c");
//                System.out.println("A is largest Number.");
//                if(a>d){
//                    System.out.println("A is largest Number.");
//                }
//                else {
//                    System.out.println("D is largest Number.");
//                }
//            }
//            else {
//                    System.out.println("C is largest Number than A.");
//
//                    if(c>d){
//                        System.out.println("C is largest Number.");
//                    }
//                    else {
//                        System.out.println("D is largest Number.");
//                    }
//                }
//            }
//            else{
//            System.out.println("B is greater than A");
//                if(b>c) {
//                    System.out.println("B is larger Number than c.");
//
//                    if(b>d){
//                        System.out.println("B is largest Number.");
//                    }
//                    else {
//                        System.out.println("D is largest Number.");
//                    }
//
//                }
//                else {
//                    System.out.println("C is larger Number than B.");
//
//                    if(c>d){
//                        System.out.println("C is largest Number.");
//                    }
//                    else {
//                        System.out.println("D is largest Number.");
//                    }
//                }
//            }


        // Ternary Operator:


//        find max out of 2 numbers

//        int a = 12;
//        int b = 23;
//        int max = 0;
//
//        max = a>b ? a:b;
//        System.out.println("Maximum value is " + max);




        // Max out of 3 : Ternary operator : Nesting

        int a = 125;
        int b = 243;
        int c = 259;
        int max = 0;

        max = a>b ? (a>c?a:c):(b>c?b:c);
        System.out.println("Maximum value is: " + max);





        }
    }


