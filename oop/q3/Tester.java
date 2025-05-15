package oop.q3;

public class Tester {
    public static void main(String[] args) {
        University university = new University();

        Student zaali = new Student("Zaali", "Injgia", "Georgia", "Hardworking CS student");

        Student ana = new Student("Ana", "Beridze", "Georgia", "Top of the class");

        university.addStudent(zaali);
        university.addStudent(ana);

        System.out.println("=== Printing Students ===");
        university.printStudents();

        System.out.println("\n=== Info for Zaali (in list) ===");
        System.out.println(university.getStudentInfoStrange(zaali));

        university.removeStudent(zaali);

        System.out.println("\n=== Info for Zaali (not in list) ===");
        System.out.println(university.getStudentInfoStrange(zaali));

        System.out.println("\n=== Info for Ana (in list) ===");
        System.out.println(university.getStudentInfoStrange(ana));

        university.removeStudent(ana);
        System.out.println("\n=== Info for Ana (not in list) ===");
        System.out.println(university.getStudentInfoStrange(ana));
    }
}
