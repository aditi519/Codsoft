package com.codesoft;
import java.util.Scanner;

public class Student_grade_cal {
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			String name ;
			System.out.println("Enter name of student ");
			name = scanner.nextLine();
			System.out.println("Enter marks obtained in each subject (out of 100) : ");
			int numberOfSubjects = 5;
			int[] marks = new int[numberOfSubjects];
			
			for (int i = 0; i < numberOfSubjects; i++) {
				System.out.print("Subject " + (i + 1) + ": ");
				marks[i] = scanner.nextInt();
			}
			
			int totalMarks = calculateTotalMarks(marks);
			
			double averagePercentage = calculateAveragePercentage(totalMarks, numberOfSubjects);
			
			char grade = calculateGrade(averagePercentage);
		
			displayResults(totalMarks, averagePercentage, grade);
			
			scanner.close();
		}
		
		public static int calculateTotalMarks(int[] marks) {
			int totalMarks = 0;
			for(int mark :marks) {
				totalMarks += mark;
			}
			return totalMarks;
		}
		
		public static double calculateAveragePercentage(int totalMarks,int numberOfSubjects) {
			return (double) totalMarks / numberOfSubjects;
		}
		
		public static char calculateGrade(double averagePercentage) {
			if (averagePercentage >= 90) {
				return 'A';
			}
			else if(averagePercentage >= 75) {
				return 'B';
			}
			else if(averagePercentage >= 60) {
				return 'C';
			}
			else if(averagePercentage > 40) {
				return 'D';
			}
			else {
				return 'F';
			}
		}
		
		//Method to display Results
		public static void displayResults(int totalMarks , double averagePercentage , char grade) {
			System.out.println("\nResults : ");
			System.out.println("Total Marks : " + totalMarks + " out of 500");
			System.out.println("Average Percentage : " + averagePercentage + "%.");
			System.out.println("Grade : " + grade);
		}
}

