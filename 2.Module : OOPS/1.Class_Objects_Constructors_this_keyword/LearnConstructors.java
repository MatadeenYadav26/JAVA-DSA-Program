package Module_2_OOPS;

public class LearnConstructors {
    static void main(String[] args) {
        Complex num1 = new Complex(3,7);
        Complex num2 = new Complex(55);
        // ye new k baad wala complex is a default constructor, they look likefunction only
        // constructors are not functions , just look like it after new keyword
        num1.print();
        num2.print();
        System.out.println("Adding 2 nums: ");
        Complex Answer = num2.add(num1);
        System.out.println(num1);
//        System.out.println(num2);
        Answer.print();
    }
}



class Complex{

    int a , b;


    public Complex(int real){
        a = real;
        b = 12;
    }

    public Complex(int a , int b){
        this.a = a; // current object k a ki value ko a k barabar kardo.
        this.b = b;// ye upar wale class k a and b ko hold karta hai which is equals to a and b as arguments of above called classes : we say it parameter.

    }


//    public Complex(){
//        a = 5;
//        b = 9;
//    }  // constant default constructor w changed value.

//    public Complex(int real , int imag){
//        a = real;
//        b = imag;
//    }

    void print(){
        System.out.println(a+" + "+b+"i");
    }

    Complex add(Complex num2){
        System.out.println(this);
        this.print();
        num2.print();
        Complex result = new Complex(a+num2.a , b+num2.b);
        return result;

        // this uses refrence values stored or used in memory. run and see location in memory.
    }

}