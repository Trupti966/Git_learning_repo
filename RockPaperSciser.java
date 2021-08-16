package Excercise_1;

import java.util.Random;
import java.util.Scanner;

public class RockPaperSciser {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Random rand=new Random();
		System.out.print("Enter your name: ");
		String name=scanner.nextLine();
		System.out.println("Welcome to the game!"+name);
		while(true) {

			System.out.print("Enter your choise (1-> Rock , 2-> Paper, 3-> Scissor, 0-> To End The Game): ");
			int user=scanner.nextInt();
			int comp=rand.nextInt(3)+1;
			switch(user) {
			case 1 -> System.out.println("Rock");
			case 2 -> System.out.println("Paper");
			case 3 -> System.out.println("Scissor");
			}
			switch(comp) {
			case 1 -> System.out.println("Rock");
			case 2 -> System.out.println("Paper");
			case 3 -> System.out.println("Scissor");
			}
			if(user==comp) {
				System.out.println("Tie");
			}else if((user==1 && comp==3)||(user==2 && comp==1)||(user==3 && comp==2)) {
				System.out.println("Congratulations! You Win!"+name);
			}else {
				System.out.println("Ohooo......You Lose!"+name);
			}
			if(user==0) {
				System.out.println("Game Over");
				break;
			}
		}
		
	}

}
