package Calculator;

import java.util.Scanner;

public class ArithmeticCalculator {
	public static void main(String[] args) {
		double n1,n2;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		n1=a.nextDouble();
		n2=a.nextDouble();
		
		System.out.println("Enter the operators (+,-,*,/)");
		char operator= a.next().charAt(0);
		double b = 0;
		switch(operator) {
		case '+':
			b = n1+n2;
			break;
		case '-':
			b = n1-n2;
			break;
		case '*':
			b = n1*n2;
			break;
		case '/':
			b = n1/n2;
			break;
		default:
			System.out.println("input invalid");
			break;		
		}
		System.out.println("The result of the operation: ");
		System.out.println(n1+" "+operator+" "+n2+"="+b);
		
	}
}
