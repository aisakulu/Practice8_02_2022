package com.peakSoft;

public class Mentor extends Person{

    public Mentor() {
    }

    public Mentor(String name, byte age, String lesson) {
        super(name, age, lesson);
    }

    public void canTeach() {
        System.out.println("Can teach");
    }

}
