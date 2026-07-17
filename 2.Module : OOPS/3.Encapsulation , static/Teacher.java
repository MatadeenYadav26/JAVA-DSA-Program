package Module_2_OOPS.OOPS_3.learnPackage;

public class Teacher {

    public int teachingClass;

    private int id;

    String degree; // this is default or package private!

    protected int studentCount;





    static void main(String[] args) {
        Teacher obj = new Teacher();
        obj.teachingClass = 13;
        obj.id = 134; // here pvt access modifier is allowed , in private as its accessible in same class.


    }
}
