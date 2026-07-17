package Module_2_OOPS.OOPS_3.learnEncapsulation;

import Module_2_OOPS.OOPS_3.learnPackage.Person;

public class MainInEncapsulation {

    public static void printHello(){
        System.out.println("Hello");
    }

    public void printHi(){
        System.out.println("Hi");
    }

    static {
        System.out.println("Called from static block");
    }

    public static void main(String[] args) {

        printHello();




//        printHi(); // cant be accessed drctly class ka object banana padega


        System.out.println("From the main method: ");
        Person p1 = new Person();
        p1.setAge(21);
        System.out.println(p1.getAge());

//        p1.count = 50; // p2 bhi date hoga kyu k iski copy 1 hi banti hai , and object independent hai .

        Person p2 = new Person();
        Person p3 = new Person();

        System.out.println(p2.count);





    }

static {
    System.out.println("Called from 2nd static block");
}


}
