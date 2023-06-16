package data;

import java.util.List;

// Применен ринцип единственной ответственности поскольку только данный класс создает объекты
// своего класса и никакой другой
public class StudentGroup implements Iterable<Student>{
    
// Применен принцип открытости / закрытости
    private List<Student> students;
    private Teacher teacher;

    public StudentGroup(List<Student> students) {
        this.students = students;        
    }

    public List<Student> getStudents() {
        return students;
    }

// Применен принцип открытости / закрытости
    protected void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

// Применен принцип открытости / закрытости
    protected void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
               "students=" + students +
               ", teacher=" + teacher +
               '}';
    }

    @Override
    public StudentGroupIterator iterator() {
        return new StudentGroupIterator(this);
    }
}
