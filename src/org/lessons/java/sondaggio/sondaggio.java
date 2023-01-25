package org.lessons.java.sondaggio;

import java.util.Scanner;

public class sondaggio {

	public static void main(String[] args) {

		int students;
		int studentsMacOs;
		int studentsWindows;
		int studentsLinux;

		Scanner s= new Scanner(System.in);

		System.out.println("How many students in your class?");
		students = s.nextInt();

		System.out.println("How many students use MacOs?");
		studentsMacOs = s.nextInt();

		System.out.println("How many students use Windows?");
		studentsWindows = s.nextInt();

		System.out.println("How many students use Linux?");
		studentsLinux = s.nextInt();

		int UserStudentsMacOs = (int) (((double)studentsMacOs * 100) / students);
		int UserStudentsWindows = (int) (((double)studentsWindows * 100) / students);
		int UserStudentsLinux = (int) (((double)studentsLinux * 100) / students);

		System.out.println(UserStudentsMacOs + "%" + " of students use MacOs");
		System.out.println(UserStudentsWindows + "%" + " of students use Windows");
		System.out.println(UserStudentsLinux + "%" + " of students use Linux");
		
		s.close();
	}

}