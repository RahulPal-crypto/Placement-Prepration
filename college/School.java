package college;

public class School {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "Mr. Brown";
        t.id = 202;
        System.out.println("Teacher name: " + t.name);
    }
}

class Teacher extends Person {
}
