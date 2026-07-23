package Module_2_OOPS.OOPs_4_abstraction;

public class learnInnerClass {
    class Toy{
        int price;
    }

    static class playStation{
        int price;
    }

    static void main(String[] args) {
//        Toy toy = new Toy(); // gives error as , for a non static class , if u need to create object , you need is a object of the parent class then object for the class
        learnInnerClass obj = new learnInnerClass();
        Toy toy = obj.new Toy();
        toy.price = 100;

        playStation playStation = new playStation();


    }
}
