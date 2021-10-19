package org.mma.training.java;

import java.util.Scanner;

public class MyIfThenElseProgram5 {

	public static void main(String[] args) {
		System.out.println("Enter your grade letter");
		Scanner scanner =new Scanner(System.in);
		String grade = scanner.next();
		String message;
		switch(grade) {
		case "A":
			message = " Excellent job!";
			break;
		case "B":
			message = " Great job!";
			break;
		case "C":
			message = " You did Ok!";
			break;
		case "D": 
			message = " You need to work a bit harder";
			break;
		case "F":
			message= " Uh Oh!";
			break;
		default:
			message =" Error. Invalid grade";
			break;
		}System.out.println(" Your grade is"+message);


	}




}


