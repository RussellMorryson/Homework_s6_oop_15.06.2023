package data;

import java.util.List;

// Применен ринцип единственной ответственности поскольку только данный класс создает объекты
// своего класса и никакой другой
public class TeacherGroup implements Iterable<Teacher> {
    
// Применен принцип открытости / закрытости
    private List <Teacher> teachers;

    public TeacherGroup(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

// Применен принцип открытости / закрытости
    protected void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {        
        return "TeacherGroup{" + 
                "teachers=" + teachers + 
                "}";
    }

    public TeacherGroupIterator iterator() {
        return new TeacherGroupIterator(this);
    }
}
