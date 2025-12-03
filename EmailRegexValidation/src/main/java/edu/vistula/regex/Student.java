package edu.vistula.regex;

public class Student {
    private String name;
    private String grade; // хранится как строка, чтобы фильтровать regex'ом

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }
}
