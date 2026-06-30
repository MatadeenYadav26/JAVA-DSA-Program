package Class4_Loops;

import java.util.Scanner;

public class whileLoops {
    static void main(String[] args) {
//        int i = 1;
//
//        while(i<=10){
//            System.out.println(i);
//            i++;
//    }


// Have You Learnt?
        Scanner sc = new Scanner(System.in);
        boolean hasLearnt = false;

        while(!hasLearnt) {
            System.out.println("Go to School,Learn and TryAgain!");
            System.out.println("Did You Learnt: ");
            hasLearnt = sc.nextBoolean() ;
        }


    }
}
