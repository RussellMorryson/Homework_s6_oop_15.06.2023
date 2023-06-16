package data;

import java.time.LocalDate;

// Применен подстановки Барбары Лисков, поскольку все последующие созданные подклассы не 
// будут противоречить данному надклассу
public class User {

// Применен принцип открытости / закрытости при котором, изменение переменных объекта не возможно извне, 
// если объект или класс объекта не наследует переменные данного класса
    private String firstName;
    private String secondName;
    private String patronymic;
    private LocalDate dateOfBirth;

// Применен принцип открытости / закрытости
    protected User(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

// Применен принцип открытости / закрытости
    protected void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

// Применен принцип открытости / закрытости
    protected void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPatronymic() {
        return patronymic;
    }

// Применен принцип открытости / закрытости
    protected void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

// Применен принцип открытости / закрытости
    protected void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "User{" +
               "firstName='" + firstName + '\'' +
               ", secondName='" + secondName + '\'' +
               ", patronymic='" + patronymic + '\'' +
               ", dateOfBirth=" + dateOfBirth +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }

        User user = (User) o;

        if (getFirstName() != null ? !getFirstName().equals(user.getFirstName()) :
                user.getFirstName() != null) {
            return false;
        }
        if (getSecondName() != null ? !getSecondName().equals(user.getSecondName()) :
                user.getSecondName() != null) {
            return false;
        }
        if (getPatronymic() != null ? !getPatronymic().equals(user.getPatronymic()) :
                user.getPatronymic() != null) {
            return false;
        }
        return getDateOfBirth() != null ? getDateOfBirth().equals(user.getDateOfBirth()) :
                user.getDateOfBirth() == null;
    }
}
