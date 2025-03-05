package oopTasks2;

public class Professor {
    private Person person;
    private String department;

    public Professor(String name, int age, String department) {
        this.person = new Person(name, age, "Professor");
        this.department = department;
    }
    public void introduce() {
        person.introduce();
        System.out.println("I am a professor in the " + department + " department.");
    }
    public void teachCourse() {
        System.out.println("I am teaching a course in the " + department + " department.");
    }
}
