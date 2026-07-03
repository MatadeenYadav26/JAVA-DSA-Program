public class methods {
    static void main(String[] args) {
//        System.out.println(1);
//        System.out.println(2);
//
////        greet();
//        System.out.println(3);
//        System.out.println(4);
        int averagefromFunction = average(4,6,true);
        int doubleofaveragefromFunction = averagefromFunction*2;


        // ye function call krne k baad avg memory me se chala jata hai , so even if u try to print it gives error as , it exists in avegrage wala code method.
//        System.out.println(avg);// seee error aya coz avg variable is not part of this memory vo bas function call par hi aya tha!
        //if u want it u need to return it in its original method and then u can call it and use it , but its like either u call function once or else save in variable to sout later or else it will come run and go out from memory of this function, like see next line:


        System.out.println(averagefromFunction);
        System.out.println(doubleofaveragefromFunction);


        //inshort value ko use karne k liye : pehle return karo , fir save in local variable then use it by sout or else it will come temprorily in fubction.

//        average(2,7,true);
    }



    //public is access modifire , if u dont write anything its a default access modifier.
    // void means jab aap kuch bhi return nahi karna chahte ho!
    //static method k andar se sirf static methods hi call kr sakte h , not nonstatic method.
    //static used bcoz : aapko wapas se kisi class ka object na banana pade!
    // void is return type! : kuch bhi nhi return karega void.
    //main toh method ka naam hai
    //Strings[] is a parameter of strings that take input in for of string in array and can be called by printing from args one by one or using for each loop!



//   static void greet(){
//       System.out.println(5);
//        System.out.println("Hello World");
//       System.out.println(6);
//    }




//    public static void  average(int a,int b,boolean shouldAvg){
//        int avg = (a+b)/2;
//        System.out.println(avg);
//    };



    public static int average(int a,int b,boolean shouldAvg){
        if(shouldAvg==false){
            return -1;
        }
        int avg = (a+b)/2;
        return avg;
        // return k baad any code u write is unreachable!u cannot execute this as , once return is exceuted u move out of the current method block!
        // or else it gives error : Unreachable statements!

    };
}
