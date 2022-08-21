package com.oop.hierarchical_inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person();
        person1.name = "Abdus Samad";
        person1.address = "Royal,kendua,Netrokona";
        person1.age = 90;
        person1.displayPerson();
        person1.contributeFamily();
        System.out.println();

        Teacher teacher1 = new Teacher();
        teacher1.name = "Lutfunessa Begum";
        teacher1.address = "kendua, Netrokona";
        teacher1.age = 60;
        teacher1.job = "Teacher";
        teacher1.schoolName = "Kendua Primary School.";
        teacher1.displayTeacher();
        teacher1.contributeFamily();
        System.out.println();

        Programmer programmer1 = new Programmer();
        programmer1.name = "Rumi";
        programmer1.address = "Bonesree,Dhaka.";
        programmer1.age = 29;
        programmer1.job = "Software Engineer";
        programmer1.officeName = "CMT group";
        programmer1.displayProgrammer();
        programmer1.contributeFamily();


		// Teacher ob1 = new Teacher("Jonota school.");
		// ob1.displayTeacher();
		
	}

}
