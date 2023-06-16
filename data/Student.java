package data;

import java.time.LocalDate;

// Применен ринцип единственной ответственности поскольку только данный класс создает объекты
// своего класса и никакой другой
public class Student extends User implements Comparable<Student>{

// Применен принцип открытости / закрытости
    private Long studentId;

    public Student(long studentId,
                    String firstName, 
                    String secondName,
                    String patronymic, 
                    LocalDate dateOfBirth) {
        super(firstName, 
                secondName, 
                patronymic, 
                dateOfBirth);
        this.studentId = studentId;
    }

    public Long getStudentId() {
        return studentId;
    }
// Применен принцип открытости / закрытости
    protected void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
               "studentId='" + studentId +'\'' +
               ", firstName='" + super.getFirstName() + '\'' +
               ", secondName='" + super.getSecondName() + '\'' +
               ", patronymic='" + super.getPatronymic() + '\'' +
               ", dateOfBirth=" + super.getDateOfBirth() +
               '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }
}
