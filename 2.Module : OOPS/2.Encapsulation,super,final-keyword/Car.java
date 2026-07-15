package Module_2_OOPS.Inheritance;

public class Car extends Vehicle {  // vehicle class k pass jo v property ya behaviours thi vo ab car class k pass v available hai , as child extends its parent class


    String color;
    // Method overriding:
    void start() {
        Scooter scooterobj = new Scooter();
        scooterobj.braking(this);
        super.start();
        System.out.println("Benz is Starting.");
        System.out.println(this);
        System.out.println(this.model+ " Car is starting.");
    }

    Car braking(){
        return this;
    }

    Car(){
        super(5);
        System.out.println("Car is being Created");
    }


    static void main(String[] args) {
        Car obj = new Car(); // usi car class ka obj bana diya.
        obj.accelerate();
//        System.out.println(obj.wheelsCount);
//        obj.wheelsCount = 4;
//        obj.model = "Mercedez-Benz";
//        obj.color = "Black";
//
//        System.out.println("Wheels count: " + obj.wheelsCount);
//        System.out.println("Model: " + obj.model);
//        obj.start();
//        System.out.println(obj.wheelsCount);

    }
}

class Scooter {
        void braking(Car car){
            System.out.println(car.model +" is braking");
        }
}
