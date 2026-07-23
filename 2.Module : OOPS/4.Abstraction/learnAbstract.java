package Module_2_OOPS.OOPs_4_abstraction;

public class learnAbstract {
//    Vehicle v1 = new Vehicle();
static void main(String[] args) {
    Car c1 = new Car();
    c1.accelerate();
    c1.brake(4);
    c1.honks();
}

}

abstract class Vehicle {
    abstract  void accelerate();
    abstract int brake(int wheels);
    void honks(){
        System.out.println("Vehicle Honks...");
    }
}

class Scooter extends Vehicle{
    void accelerate() {

    }

    int brake(int wheels) {
        return 0;
    }
}



class Car extends Vehicle {

//    @Override // can be said simply for spelling check of parent class , or else unnsesarry
    void accelerate() {
        System.out.println("accelerating...");
    }

    @Override
    int brake(int wheels) {
        System.out.println("braking...");
        return wheels;
    }

    void honks(){
        System.out.println("Car is Honked...");
    }

}
