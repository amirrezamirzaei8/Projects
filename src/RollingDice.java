import java.util.Random;
import java.util.Scanner;

public class RollingDice {

	public static void main(String[] args) {
		
		/*	Random randomNumber = new Random();
		
		int x = randomNumber.nextInt(6) + 1;
		
		if(x == 6) {
			System.out.println("Congrats You rolled a " + x + " now you can roll another time");
		} else {
			System.out.println("you rolled " + x);
		}		*/
		
		
		Scanner Scan = new Scanner(System.in);
		System.out.println("Please enter a month");
		int month = Scan.nextInt();
		
		switch(month) {
		case 1:
			System.out.println("Farvardin");
			break;
		case 2:
			System.out.println("Ordibehesht");
			break;
		case 3:
			System.out.println("Khordad");
			break;
		case 4:
			System.out.println("Tir");
			break;
		case 5:
			System.out.println("Mordad");
			break;
		case 6:
			System.out.println("Shahrivar");
			break;
		case 7:
			System.out.println("Mehr");
			break;
		case 8:
			System.out.println("Aban");
			break;
		case 9:
			System.out.println("Azar");
			break;
		case 10:
			System.out.println("Dey");
			break;
		case 11:
			System.out.println("Bahman");
			break;
		case 12:
			System.out.println("Esfand");
			break;
			default:
				System.out.println("please enter a valid month");
		}
		
		

	}

}
