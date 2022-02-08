package com.peakSoft;

public class Student extends Person{
    private String time;
    private String level;

    public Student() {

    }

    public Student(String name, byte age, String lesson, String time, String level) {
        super(name, age, lesson);
        this.time = time;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Student{" +
                "time='" + time + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}
