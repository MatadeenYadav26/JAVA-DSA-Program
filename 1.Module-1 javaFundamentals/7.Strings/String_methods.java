package class7_Strings;
// here in below all this , java creates a new string doesnt replace the oldone as , in java Strings are immutable.
public class String_methods {
    static void main(String[] args) {
//        String name = "    aMaN26     ";
//        System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase());
//        System.out.println(name.trim());// removes spaces around the text not btwn.
//        //startswith checks ifstarting wth start or not:
//        System.out.println("Carpets".startsWith("bike"));
//        System.out.println("Carpets".startsWith("car")); // not even diffrent cases are accepted!
//        System.out.println("Carpets".startsWith("Car"));
//        System.out.println("Carpets".endsWith("ts")); //checks ends
//        System.out.println("Carpets".equals("pets"));
//        System.out.println("Carpets".equalsIgnoreCase("carpets"));
//        //charAt() : string k value me koi character konsi position pr present hai:
//        System.out.println("Carpets".charAt(3));
//        // valueOf() : converts int,double,float to string
//        int age = 123;
//        String stringAge = String.valueOf(age);
//        System.out.println(age+4); // int value
//        System.out.println(stringAge+4); // string value
//
//        String sentence = "I Love Java , Java is a good language!";
//
//        String newsentence = sentence.replace("Java","Python");

//        System.out.println(sentence);
//        System.out.println(newsentence);
//        System.out.println(sentence.contains("Java"));
//        System.out.println(sentence.contains("java"));

//        String substring = sentence.substring(0,6);
//        String substring2 = sentence.substring(3);
//        System.out.println(substring);
//        System.out.println(substring2);

// split():

//        String words[] = sentence.split(" "); // split on basis or space , you can add comma or anything.
//        for(String word : words){
//            System.out.println(word);
//        }


//  String to char Arr :-
//        String color = "Brown is my favorite color!";
//        char letters[] = color.toCharArray();
//
//        for(char letter : letters ){
//            System.out.println(letter);
//        }


// Is string empty:
        String animal = "   ";
        System.out.println(animal.isEmpty()); // spaces are counted.
        System.out.println(animal.isBlank());// spaces are considered blank.




    }
}
