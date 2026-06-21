public class Variables {
    static void main(String[] args) {

//        boolean isPassed = true;
//        int count = 12;
//        byte marks = -128; // byte ki range: -128 to 127
//        short students = 1235;
//        float pi = 3.14f; // 6-7 decimal digits , for determining its a float number add a 'f' after use of number.
//        double di = 3.1234567893234567;//upto 15 decimal digits.
//        char myLetter =  'A'; // a != A , single quote me characters (''), double quotes me strings ("").
//
//        // java upar se neeche chalta hai , pehle varable banao fir hi call hoga vrna error , not like Javascript.
//        // print vs println : 'ln' tells after print move to next line , without it all code output will come on same line.
//
//        System.out.println(isPassed);
//        System.out.println(count);
//        System.out.println(marks);
//        System.out.println(students);
//        System.out.println(pi);
//        System.out.println(di);
//        System.out.println(myLetter);

        //Implicit Conversion: Direct Conversion : chota bade me store ho skta hai but ulta nahi : error ayega ya explicit conversion karna padega!


//        int xyz = 88;
//        long abc = xyz;
//        System.out.println(abc);

//        explicit conversion : int to byte

        int age = 150;
        int explicitConversion = (byte)age;  // (byte) is cheez ko mention karne ko kehte hai 'Type-casting'.
        System.out.println(explicitConversion);// how -106 why? : vo rotate hogya 127 se -128 then -127 ese krke -106 pr agya , rotation hojata hai.

// Comments:

        // single line comment : CTRL + /

        /* Multi Line Comment : select then : CTRL + Shift + /
        ye
        hai
        multiline
        comment
         */
    }
}
