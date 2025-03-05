package oopTasks2;

public class Administrator {
    private Person person;
    private String department;

    public Administrator(String name, int age, String department) {
        this.person = new Person(name, age, "Administrator");
        this.department = department;
    }
    public void introduce() {
        person.introduce();
        System.out.println("I work as an administrator in the " + department + " department.");
    }
    public void manage() {
        System.out.println("I am managing the operations in the " + department + " department.");
    }
}
