package data;

import java.time.LocalDate;

// Применен ринцип единственной ответственности поскольку только данный класс создает объекты
// своего класса и никакой другой
public class Teacher extends User implements Comparable<Teacher> {
    
// Применен принцип открытости / закрытости
    private Long teacherId;

    public Teacher(long teacherId, 
                    String firstName, 
                    String secondName, 
                    String patronymic, 
                    LocalDate dateOfBirth) {
        super(firstName, 
                secondName, 
                patronymic, 
                dateOfBirth);
        this.teacherId = teacherId;
    }

    public Long getTeacherId() {
        return teacherId;
    }
// Применен принцип открытости / закрытости
    protected void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
               "teacherId='" + teacherId +'\'' +
               ", firstName='" + super.getFirstName() + '\'' +
               ", secondName='" + super.getSecondName() + '\'' +
               ", patronymic='" + super.getPatronymic() + '\'' +
               ", dateOfBirth=" + super.getDateOfBirth() +
               '}';
    }

    @Override
    public int compareTo(Teacher o) {
        return this.teacherId.compareTo(o.teacherId);
    }
}
