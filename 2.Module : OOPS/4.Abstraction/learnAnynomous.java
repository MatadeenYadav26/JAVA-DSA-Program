package Module_2_OOPS.OOPs_4_abstraction;

public class learnAnynomous {

//    SuperInterface obj2 = new SuperInterface() {
//        @Override
//        public void InnerMethod() {
//
//        }
//    };

    // lambda expressions : obj2 can be replaced by obj 3 , as for a functunal interface we can simplify it with lambda functions/expressions
    SuperInterface obj3 =  () -> {

    };



static void main(String[] args) {

    Walkable obj = (int steps) -> {
        System.out.println("Walked: " + steps + " steps");
        return steps;
    };

//    int walks = Walkable.walks(5);


    Walkable obj2 = (steps) -> 2*steps;

    System.out.println(obj2.walks(8));

}
}



class OuterClass{

    // ye ek anonymous class hai jo outerclass ki ek child class h and usko koi naam nahi, can be used only once
    OuterClass obj = new OuterClass() {
        void sing(){

        }

        public void outerMethod(){
            System.out.println("You can also override method here");
        }
    };

    public void outerMethod(){



    }
}

@FunctionalInterface // use @ to tell to coders ki see this is a functional interface!
interface SuperInterface{ // this can be said as functional interface as , it has ony 1 method.
    void InnerMethod();
}

interface Walkable{
    int walks(int steps);
}