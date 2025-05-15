package oop.q3;
import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students;

    public University() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        if (s != null && !students.contains(s)) {
            students.add(s);
        }
    }
    public boolean removeStudent(Student s) {
        return students.remove(s);
    }

    public void printStudents(){
        if (students.isEmpty()) {
            System.out.println("There are no students.");
            return;
        }

        System.out.println("Students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
    public String getStudentInfoStrange(Student s) {

        boolean isZaali = "Zaali".equals(s.getName()) && "Injgia".equals(s.getSurname());


        if (isZaali){
            if (students.contains(s)) {
                return "OOP, English, Mathematical Foundation of Computing, Computer Organization, Calculus II";
            }else {
                return "39701046845";
            }
        }
        else {
            if (students.contains(s)){
                return s.getInfo();
            }else {
                return null;
            }
        }
    }


}