/*
 * Ryan Schachte
 * Copyright 2014
 * CSE 205 Final Grade Calculator
 */

import java.util.Scanner;
public class Menu {
	
	public static void main(String[]args)
	{
		boolean loop = true;
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Please pick one of the following choices: ");
		System.out.println("A:\tCalculate Final Grade\nB:\tCalculate Grade You Need To Get an A for Exam 3");
		
		
		String choice = input.nextLine();
		switch (choice) 
		{
		
		case "A": 	System.out.println("Enter you average exam percentage: ");
						double examGrade = input.nextDouble();
						
					System.out.println("Enter your average assignment percentage: ");
					double assignmentGrade = input.nextDouble();
						
					System.out.println("Enter your average quiz score: ");
					double quizGrade = input.nextDouble();
					
					System.out.println(calculateFinalGrade(examGrade, assignmentGrade, quizGrade));
			
			break;

		case "B":	System.out.println("Enter your exam 1 grade: ");
						double exam1 = input.nextDouble();
					System.out.println("Enter your exam 2 grade: ");
						double exam2 = input.nextDouble();
					System.out.println(exam3(exam1, exam2));
			break;
			
		default:
			System.out.println("Error");
		
		}
	}
	
	public static String calculateFinalGrade(double examScores, double assignmentScores, double quizzesScore)
	{
		/*
		 * Exam = 60%
		 * Assignment = 40%
		 * Attendance/Quizzes = 5%
		 * Total = 105%
		 */
		
		String finalGradeLetter = "";
		
		double finalScore = .571428*(examScores) + .38095*(assignmentScores) + .047619*(quizzesScore);
		
		if (finalScore >= 98)
			finalGradeLetter = "A+";
		else if(finalScore >= 90 && finalScore <98)
			finalGradeLetter = "A";
		else if(finalScore >= 88 && finalScore <90)
			finalGradeLetter = "B+";
		else if(finalScore >= 80 && finalScore <88)
			finalGradeLetter = "B";
		else if(finalScore >= 78 && finalScore <80)
			finalGradeLetter = "C+";
		else if(finalScore >= 70 && finalScore <80)
			finalGradeLetter = "C";
		else if(finalScore >= 60 && finalScore <70)
			finalGradeLetter = "D";
		else if(finalScore < 60)
			finalGradeLetter = "E";

		String finalGrade = "You final grade is " + finalScore + "%. Which is an " + finalGradeLetter + "!";
		
		return finalGrade;
		
		
	}
	
	public static String exam3(double one, double two)
	{
		double thirdExam = 270 - (one+two);
		String thirdExamScore = "Because you scored a " + one + "% on exam 1\nBecause you scored a " + two + "% on exam 2\nYou need at least a " + thirdExam + "% to have a 90% test average in CSE205.";
		return thirdExamScore;
	}

}
