package Module_2_OOPS.OOPs_4_abstraction;

public class learnInterface {

    static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.eats();
        monkey.sings();
        monkey.drinks();

        System.out.println(Animal.LEGS);
    }

    // interface k andar aane wale methods are abstract methods only until and unless its not a default method.
    //Animal a1 = new Animal(); This is also not allowed without anonymous oject.


}


interface Pets{
    void sings();

    void drinks();
}

interface Animal{

    void eats();
    void drinks();

    public static final int LEGS = 4;
    // even if public static final is not mentioned , it is by default public static final
    default void walk(){ //here in interfaces you need to use default keyword to use a non abstract method / non concrete method
        System.out.println("Animal is walking");
    }
}

class Monkey implements Animal,Pets {

    @Override
    public void eats() {
        System.out.println("Monkey eats...");
    }

    @Override
    public void drinks() {
        System.out.println("Monkey drinks...");
    }

    @Override
    public void sings() {
        System.out.println("Monkey sings...");
    }
}






