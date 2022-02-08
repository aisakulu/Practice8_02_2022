package com.peakSoft;

import java.time.LocalDate;

public class Person {
    private String name;
    private byte age;
    private String lesson;

    public Person() {

    }

    public Person(String name, byte age, String lesson) {
        this.name = name;
        this.age = age;
        this.lesson = lesson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public void canWalk() {
        System.out.println("Can walk");
    }
    public void canTalk() {
        System.out.println("Can talk");
    }

}
