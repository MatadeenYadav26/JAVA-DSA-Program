package class7_Strings;

import org.w3c.dom.ls.LSOutput;

public class Strings {
    static void main(String[] args) {

        String name = "Aman";
        String sameName = "Aman";
        String newName = new String("Aman");
        String newName2 = new String("aman");


//        if(name ==  sameName){
//            System.out.println("Both are same!");
//        }
//
//        if(name == newName){
//            System.out.println("Both are same!");
//        }else {
//            System.out.println("Both are not same!");
//        }
        // above was string refrence location / value comparision
        // string value comparision:

//        if(name.equals(newName)){
//            System.out.println("name and newName have same values");
//        }else {
//            System.out.println("name and newName have different values");
//        }

        if(name.equalsIgnoreCase(newName2)){
            System.out.println("name and newName have same values ignoring case.");
        }else {
            System.out.println("name and newName have different values ignoring case.");
        }
    }
}
