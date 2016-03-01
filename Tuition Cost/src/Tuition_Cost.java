import java.util.Scanner;
public class Tuition_Cost {
	/*This code asks the user for input and calculates the total price of tuition
	 * and monthly loan payment for a college.
	 * No parameter
	 * No return
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double initial_tuition;
		System.out.println("Enter the initial tuition cost: ");
		initial_tuition = input.nextDouble();
		double tuition_percentage;
		System.out.println("Enter the percentage increase of tuition: ");
		tuition_percentage = input.nextDouble();
		double APR;
		System.out.println("Enter the annual loan payment rate: ");
		APR = input.nextDouble();
		int term;
		System.out.println("Enter the term in which you pay your loan (in years): ");
		term = input.nextInt();
		double fixed_payment;
		System.out.println("Enter the fixed amount you pay per term: ");
		fixed_payment = input.nextDouble();
		double total_tuition = (initial_tuition * Math.pow((1 + tuition_percentage),4));
		double monthly_payment = ((APR * fixed_payment)/(1- Math.pow((1 + APR), -term)));
		System.out.printf("The total tuition payment is $%.2f%n", total_tuition);
		System.out.printf("The monthly loan payment is $%.2f%n", monthly_payment);
	}

}
