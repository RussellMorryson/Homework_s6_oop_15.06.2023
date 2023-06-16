import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

import data.Student;
import data.StudentGroup;

import data.Teacher;
import data.TeacherGroup;

public class Main {
    public static void main(String[] args) {
        StudentGroup students = new StudentGroup(List.of(
            new Student(1, "Максим", "Петров", "Александрович", LocalDate.now()),
            new Student(2, "Александр", "Сидоров", "Петрович", LocalDate.now()),
            new Student(3, "Кристина", "Борисова", "Семеновна", LocalDate.now())));


        TeacherGroup teachers = new TeacherGroup(List.of(
            new Teacher(1, "Федор", "Калинин", "Максимович", LocalDate.now()),
            new Teacher(2, "Георгий", "Горохов", "Константинович", LocalDate.now()),
            new Teacher(3, "Мария", "Герасимова", "Леонидовна", LocalDate.now())));


        Iterator<Student> studentIterator = students.iterator();
            while (studentIterator.hasNext()){
                System.out.println(studentIterator.next().toString());
            }
        
        System.out.println("//////////////////////////////////////////////////");
        
        Iterator<Teacher> teacherIterator = teachers.iterator();
            while (teacherIterator.hasNext()){
                System.out.println(teacherIterator.next().toString());
            }
    }
}
