package Module_2_OOPS.Inheritance;

public  class Vehicle {  //final : isme final keword use kiya toh aage car k class error dega coz final class cant have subclasses.

    final int gears = 4;// this variable cant be updated now.

    static void main(String[] args) {
        Vehicle v1 = new Vehicle(2);

    }

    int wheelsCount;
    String model;
    Vehicle(){
        System.out.println("Creating a Vehicle instance");
    }

    Vehicle(int wheelsCount){
        this.wheelsCount = wheelsCount;
        System.out.println("Creating a Vehicle with wheels");
    }
    void start(){
        System.out.println("Vehicle is starting.");
    }


    final void accelerate(){ // this method cannot be overriden in ths or even in its subclasses.
        System.out.println("Vehicle is accelerating");
    }

}
