package oopTasks2;

public class Student {
    private Person person;
    private String major;

    public Student(String name, int age, String major) {
        this.person = new Person(name, age, "Student");
        this.major = major;
    }
    public void introduce() {
        person.introduce();
        System.out.println("I am studying " + major + ".");
    }
    public void study() {
        System.out.println("I am studying for my " + major + " courses.");
    }
}