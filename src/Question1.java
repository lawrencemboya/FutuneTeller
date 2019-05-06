import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("WELCOME TO YOUR FUTURE");

		// PART ONE NAME
		System.out.println("What is your First name?");
		String firstName = input.nextLine();
		System.out.println("Hi " + firstName + "!");

		System.out.println("What is your Last name?");
		String lastName = input.nextLine();
		System.out.println("Nice to meet you, " + firstName + " " + lastName + ".");

		// PART ONE AGE
		System.out.println("How old are you " + "Mr " + lastName + "?");
		int age = input.nextInt();
		System.out.println("Looking sharp for " + age + " years.");

		// PART ONE BIRTHMONTH

		boolean monthLoop = true;
		int month = 0;
		while (monthLoop == true) {
			System.out.println("What is your month of birth?");
			month = input.nextInt();
			if (month > 12) {
				System.out.println("Enter valid month");
			} else {
				monthLoop = false;
			}
		}
		System.out.println(month + " that is a lucky month.");
		// PART ONE COLOR

		System.out.println("What is your favourite ROYGBIV color? If you don't know type \"Help\"");
		String color = input.next();
		boolean help = false;

		if (color.toLowerCase().equals("help")) {
			help = true;
		}
		;

		while (help == true) {

			System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo and violet");

			System.out.println("What is ROYGBIV color? If you don't know type \"Help\"");
			color = input.next();

			if (color.toLowerCase().contains("red") || color.toLowerCase().contains("orange")
					|| color.toLowerCase().contains("green") || color.toLowerCase().contains("blue")
					|| color.toLowerCase().contains("indigo") || color.toLowerCase().contains("violet")
					|| color.toLowerCase().contains("yellow"))

			{
				help = false;

			}

		}
		System.out.println(color + ", nice choice");
		System.out.println("How many sublings do you have?");
		int sublings = input.nextInt();

		// code here

		System.out.println("THANK YOU FOR THAT, " + "THIS IS HOW YOUR FUTURE LOOKS LIKE");

		// PART TWO- CONDITIONS
		// PART TWO RETIREMENT YEARS

		String agePlace = null;
		if (age % 2 == 0) {
			agePlace = " 10 years from now";
		} else {
			agePlace = " 15 years from now";
		}

		// PART TWO VACATION HOME

		String sublingsLocation = null;
		if (sublings == 0) {
			sublingsLocation = " New York";
		} else if (sublings == 1) {
			sublingsLocation = " Florida";
		} else if (sublings == 2) {
			sublingsLocation = " Ohio";
		} else if (sublings == 3) {
			sublingsLocation = " Carlifornia";
		} else if (sublings > 3) {
			sublingsLocation = " Texas";
		} else {
			sublingsLocation = " a bad loation";
		}

		// PART TWO MODE OF TRANSPORTATION
		String colorCar = null;
		if (color.toLowerCase().equals("red")) {
			colorCar = " Ferarri";
		} else if (color.toLowerCase().equals("orange")) {
			colorCar = " Chevrolet";
		} else if (color.toLowerCase().equals("yellow")) {
			colorCar = " Lamborghini";

		} else if (color.toLowerCase().equals("green")) {
			colorCar = " Dodge";

		} else if (color.toLowerCase().equals("blue")) {
			colorCar = " Mistubishi";
		} else if (color.toLowerCase().equals("indigo")) {
			colorCar = " Honda";

		} else
			colorCar = " Toyota";

		// PART TWO BANK BALANCE

		String monthMoney = null;
		if (month >= 1 && month <= 4) {
			monthMoney = " 1 Million";

		} else if (month >= 5 && month <= 8) {
			monthMoney = " 2 Million";

		} else if (month >= 9 && month <= 12) {
			monthMoney = " 3 Million";

		} else {
			monthMoney = "Your balance is 0";

		}

		// PART 3 OUTPUT FORMAT

		System.out.println(firstName + " " + lastName + " will retire in " + agePlace + " with" + monthMoney
				+ " in the bank, a vacation home in " + sublingsLocation + " and travel by a" + colorCar);
		input.close();
	}

}
