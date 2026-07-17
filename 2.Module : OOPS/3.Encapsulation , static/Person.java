package Module_2_OOPS.OOPS_3.learnPackage;

public class Person {

    private int age;

    public static int count = 0; //

    public Person(){
        count++;
    }


    private String name;

    boolean canBeChanged = true;


    public void setAge(int age) { // for declaration
        if(canBeChanged) {
            if (age > 0) {
                this.age = age;
            }
        }
    }

    public int getAge() {  // for accessing
        return age;
    }
}



