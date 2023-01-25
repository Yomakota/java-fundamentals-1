package org.lessons.java.sondaggio;

import java.util.Scanner;

public class sondaggio {

	public static void main(String[] args) {

		int students;
		int studentsMacOs;
		int studentsWindows;
		int studentsLinux;

		Scanner data= new Scanner(System.in);

		System.out.println("How many students in your class?");
		students = data.nextInt();

		System.out.println("How many students use MacOs?");
		studentsMacOs = data.nextInt();

		System.out.println("How many students use Windows?");
		studentsWindows = data.nextInt();

		System.out.println("How many students use Linux?");
		studentsLinux = data.nextInt();

		int UserStudentsMacOs = (studentsMacOs * 100) / students;
		int UserStudentsWindows = (studentsWindows * 100) / students;
		int UserStudentsLinux = (studentsLinux * 100) / students;

		System.out.println(UserStudentsMacOs + "%" + " of students use MacOs");
		System.out.println(UserStudentsWindows + "%" + " of students use Windows");
		System.out.println(UserStudentsLinux + "%" + " of students use Linux");
		
		data.close();
	}

}