package Module_2_OOPS.OOPS_3.learnPackage;

import Module_2_OOPS.OOPS_3.learnEncapsulation.MainInEncapsulation;

public class MainClass {
    static void main(String[] args) {

        Teacher obj = new Teacher();
        obj.teachingClass = 12; // can be accessed and modified , as access modifier is public.
//        obj.id = 123; // gives an error as , access modifier is private.
        obj.degree = "ABC";

        MainInEncapsulation.printHello();
//        MainInEncapsulation.printHi();



    }
}
