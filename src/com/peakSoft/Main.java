package com.peakSoft;

public class Main {

    public static void main(String[] args) {
	// write your code here
       Person person = new Person();
       Student student = new Student("Habib", (byte) 36,"Java","Evning","Begginer");
       student.canTalk();
       student.canWalk();
        System.out.println(student);
       Mentor mentor = new Mentor("Beksultan", (byte) 25,"Java");
        System.out.println(mentor);
        mentor.canTeach();
        mentor.canWalk();
        mentor.canTalk();
       Instructor instr = new Instructor("Muhammed", (byte) 28,"Java");
        System.out.println(instr);
        instr.canTalk();
        instr.canWalk();




    }
}
