package oopTasks2;

public class Main {
    public static void main(String[] args) {
        // burda professoru studenti bir de administratoru yaradiriq
        Professor professor = new Professor("Dr. Xaliq", 35, "Comp. Science");
        professor.introduce();
        professor.teachCourse();
        System.out.println();

        Student student = new Student("Vafa Khanim Habilova", 20, "Comp. Science");
        student.introduce();
        student.study();
        System.out.println();

        Administrator administrator = new Administrator("Mr. Yuzammed", 20, "IT Support");
        administrator.introduce();
        administrator.manage();
    }
}

