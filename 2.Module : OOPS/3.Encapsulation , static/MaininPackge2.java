package Module_2_OOPS.OOPS_3.lrnPackage2;

import Module_2_OOPS.OOPS_3.learnPackage.Teacher;

public class MaininPackge2 extends Teacher {

    static void main(String[] args) {
        Teacher obj = new Teacher();
        obj.teachingClass = 15; // available as its in public class
//        obj.id = 1234; : error as this is diffrent package
//        obj.degree = "XYZ"; : error as default packages are accessible inside their package only.


        MaininPackge2 obj2 = new MaininPackge2();
        obj2.studentCount = 100;


    }
}
