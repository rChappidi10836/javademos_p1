package arithmetic_calculator;

import java.util.Scanner;

public class ARITHCAL {

	static int a = 0, b = 0;

	public static void main(String[] args) {

		System.out.println(" 				ARITHCAL           ");

		while (true) {
			Scanner cr = new Scanner(System.in);
			System.out.println("\n\t1.  ADD\n\t2.  SUB\n\t3.  MUL\n\t4.  DIV\n\t5.  MODDIV\n\t6.  Exit");// MENU FOR CALCULATIONS
			System.out.println("Enter the requried calculation option:");// CHOOSHING CALCULATION
			int ch = cr.nextInt();
			switch (ch) {
			case 1:
				add();
				break;
			case 2:
				sub();
				break;
			case 3:
				mul();
				break;
			case 4:
				div();
				break;
			case 5:
				moddiv();
				break;
			case 6:
				System.exit(0); // CHOICE TO END PROGRAM
			default:
				System.out.println("Enter corret choice");
			}
		}
	}

	public static void assign() {

		// to assign values to the static variable in the class
		Scanner ao = new Scanner(System.in);
		System.out.print("Enter 1st value :");
		a = ao.nextInt();
		System.out.print("Enter 2nd value :");
		b = ao.nextInt();
	}

	private static void add() {

		// ADDITION
		System.out.println(" 		ADDITION      ");

		Scanner add = new Scanner(System.in);
		assign();
		int sum = a + b;
		while (true) {
			System.out.println("To add more Enter\n1-> Yes\t2-> No");
			int c = add.nextInt();
			if (c == 1) {
				System.out.print("Enter number to add:");
				sum += add.nextInt();
			} else {
				break;
			}
		}
		System.out.println("SUM = " + sum);

	}

	private static void sub() {

		// SUBTRACTION
		System.out.println(" 		SUBTRACTION      ");
		assign();
		System.out.println("  " + a + "-" + b + "=" + (a - b));

	}

	private static void mul() {

		// MULTIPLICATION
		System.out.println(" 		MULTIPLICATION      ");
		assign();
		System.out.println("  " + a + "*" + b + "=" + (a * b));

	}

	private static void div() {

		// DIVISION
		System.out.println(" 		DIVISION      ");
		assign();
		System.out.println("  " + a + "/" + b + "=" + (a / b));

	}

	private static void moddiv() {

		// MODULO DIVISION
		System.out.println(" 		MODULO DIVISION      ");
		assign();
		System.out.println("  " + a + "%" + b + "=" + (a % b));

	}

}
