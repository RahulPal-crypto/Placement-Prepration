package college;

public class College {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Alice";
        s.id = 101;
        s.contact = 1234567890;
        System.out.println("Student name: " + s.name);
    }
}

class Person {
    public String name;
    protected int id;
    private String address;
    int contact;
}

class Student extends Person {
}
