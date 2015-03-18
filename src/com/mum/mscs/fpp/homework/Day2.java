/**
 * 
 */
package com.mum.mscs.fpp.homework;

import java.util.Scanner;

/**
 * @author 984417
 *
 */
public class Day2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Day 1 - Homework");
		
		Day2 d2 = new Day2();
		
//		d2.weightOnPlanets();
//		d2.compareUSMexicoPopulation();
//		d2.rhombus();
		d2.studentGrades();
		
	}

	/**
	 * 1. Write a program that prompts the user to input an odd digit should be
	 * below 10. The program should then output a rhombus of that size using the
	 * digit.
	 */

	public void rhombus() {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter odd number between 1 to 10:");
		int num = input.nextInt();

		if (num < 10 && (num % 2) == 1) {
			int i, j, n = 4, n1 = 2;
			for (i = 1; i <= 4; i++) {
				for (int sp = 0; sp <= n; sp++) {
					System.out.print(" ");
				}
				for (j = 1; j <= i; j++) {
					System.out.print("* ");
				}
				n--;
				System.out.print("\n");
			}

			for (i = 3; i >= 1; i--) {
				for (int sp = 0; sp <= n1; sp++) {
					System.out.print(" ");
				}

				for (j = i; j >= 1; j--) {
					System.out.print("* ");
				}
				n1++;
				System.out.print("\n");
			}
		} else {
			System.out.println("Not a valid odd number between 1 to 10");
		}
	}

	/**
	 * 2. Write a Program using switch statement to find the weight of a person
	 * in various planets according to the choice of user input.
	 * 
	 * Get the input from the user in lbs.
	 * Weight = Input * Relative gravity
	 * Choice Planet Relative gravity
	 * 
	 * 1 Venus 0.78
	 * 2 Mars 0.39
	 * 3 Jupiter 2.65
	 * 4 Saturn 1.17
	 * 5 Uranus 1.05
	 * 6 Neptune 1.23
	 */
	
	public void weightOnPlanets() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter user weight:");
		int userweight = input.nextInt();
		
		System.out.println("Choose planet below :\n "
				+ "1. Venus 0.78 \n "
				+ "2. Mars 0.39 \n "
				+ "3. Jupiter 2.65 \n "
				+ "4. Saturn 1.17 \n "
				+ "5. Uranus 1.05 \n "
				+ "6. Neptune 1.23");
		int planetChoice = input.nextInt();
		
		switch (planetChoice) {
		case 1:
			System.out.println("Weight on Venus :"+ (userweight * 0.78));
			break;
		case 2:
			System.out.println("Weight on Mars :"+ (userweight * 0.39));
			break;
		case 3:
			System.out.println("Weight on Jupiter :"+ (userweight * 2.65));
			break;
		case 4:
			System.out.println("Weight on Saturn :"+ (userweight * 1.17));
			break;
		case 5:
			System.out.println("Weight on Uranus :"+ (userweight * 1.05));
			break;
		case 6:
			System.out.println("Weight on Neptune :"+ (userweight * 1.23));
			break;
		default:
			break;
		}
	}
	
	/**
	 * 3. Assume that the population of Mexico is 114 million and that the
	 * population increases 10.01 percent annually. Assume that the population
	 * of the United States is 312 million and that the population is reduced
	 * 5.15 percent annually. 
	 * Write an application that displays the populations
	 * for the two countries every year until the population of Mexico exceeds
	 * that of the United States, and display the number of years it took.
	 */
	
	public void compareUSMexicoPopulation() {
		
		for(double m=114000000,u=312000000,i=0;m < u;m=m+11411400,u=u-16068000,i++) {
			System.out.println("Mexico population:"+m+" US Population:"+u +"Number of years :"+i);
		}
		
	}
	
	
	/**
	 * 4. Write a program that grades multiple-choice tests. Assume there are
	 * eight students and ten questions, and the answers are stored in a
	 * two-dimensional array. Each row records a student’s answers to the
	 * questions, as shown in the following array.
	 * 
	 * The key is stored in a one-dimensional array:
	 * 
	 * Your program grades the test and displays the result. It compares each
	 * student’s answers with the key, counts the number of correct answers, and
	 * displays it.
	 * 
	 */
	public void studentGrades() {
		
		char [][] studentAnswers = {
						{'A','B','A','C','C','D','E','E','A','D'},
						{'D','B','A','B','C','A','E','E','A','D'},
						{'E','D','D','A','C','B','E','E','A','D'},
						{'C','B','A','E','D','C','E','E','A','D'},
						{'A','B','D','C','C','D','E','E','A','D'},
						{'B','B','E','C','C','D','E','E','A','D'},
						{'B','B','A','C','C','D','E','E','A','D'},
						{'E','B','E','C','C','D','E','E','A','D'}
						};
	
		
		char[] keysheet={'D','B','D','C','C','D','A','E','A','D'};
		
		
		for (int i = 0; i < studentAnswers.length; i++) {
			int count = 0;
			for (int j = 0; j < studentAnswers[i].length; j++) {
				if(studentAnswers[i][j]==keysheet[j]){
					count++;
				}
			}
			System.out.printf("Student %d's correct count is %d\n",i,count);
		}
	
	
	
	
	}
	

	
}
