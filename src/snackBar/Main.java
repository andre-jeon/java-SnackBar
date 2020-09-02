package snackBar;

/*
snackBar
	Snack
	Customer
	Vending Machine
*/


public class Main {

	private static void workWithData() {
		System.out.println("Welcome to the Snack Bar!!!");

		VendingMachine food = new VendingMachine("Food");
		VendingMachine drink = new VendingMachine("Drink");
		VendingMachine office = new VendingMachine("Office");

		// Snack(String name, int quantity, double cost, int vendingMachineId)
		Snack chips = new Snack("Chips", 36, 1.75, food.getId());
		Snack chocolateBar = new Snack("Chocolate Bar", 36, 1, food.getId());
		Snack pretzel = new Snack("Pretzel", 30, 2, food.getId());

		Snack soda = new Snack("Soda", 24, 2.5, drink.getId());
		Snack water = new Snack("Water", 20, 2.75, drink.getId());

		// 	Customer(String name, double cashOnHand)
		Customer jane = new Customer("Jane", 45.25);
		Customer bob = new Customer("Bob", 33.14);

		// Customer 1 cash on hand $37.75
		// Quantity of snack 4 is 21
		jane.buySnacks(soda.totalCost(3));
		soda.buySnacks(3);
		System.out.println("Customer " + jane.getId() + " cash on hand $" + jane.getCashOnHand());
		System.out.println("Quantity of snack " + soda.getId() + " is " + soda.getQuantity());

		// Customer 1 cash on hand $35.75
		// Quanity of snack 3 is 29
		jane.buySnacks(pretzel.totalCost(1));
		pretzel.buySnacks(1);
		System.out.println("Customer " + jane.getId() + " cash on hand $" + jane.getCashOnHand());
		System.out.println("Quantity of snack " + pretzel.getId() + " is " + pretzel.getQuantity());

		// Customer 2 cash on hand $28.14
		// Quantity of snack 4 is 19
		bob.buySnacks(soda.totalCost(2));
		soda.buySnacks(2);
		System.out.println("Customer " + bob.getId() + " cash on hand $" + bob.getCashOnHand());
		System.out.println("Quantity of snack " + soda.getId() + " is " + soda.getQuantity());

		// Customer 1 cash on hand $45.75
		jane.addCash(10);
		System.out.println("Customer " + jane.getId() + " cash on hand $"+ jane.getCashOnHand());

		// Customer 1 cash on hand $44.75
		// Quantity of snack 2 is 35
		jane.buySnacks(chocolateBar.totalCost(1));
		chocolateBar.buySnacks(1);
		System.out.println("Customer " + jane.getId() + " cash on hand $" + jane.getCashOnHand());
		System.out.println("Quantity of snack " + chocolateBar.getId() + " is " + chocolateBar.getQuantity());

		// Quantity of snack 3 is 41
		pretzel.setQuantity(12);
		System.out.println("Quantity of snack " + pretzel.getId() + " is " + pretzel.getQuantity());

		// customer 2 cash on hand $22.14
		// Quantity of snack 3 is 38
		bob.buySnacks(pretzel.totalCost(3));
		pretzel.buySnacks(3);
		System.out.println("Customer " + bob.getId() + " cash on hand $" + bob.getCashOnHand());
		System.out.println("Quantity of snack " + pretzel.getId() + " is " + pretzel.getQuantity());
	}
	public static void main(String[] args) {
		workWithData();
	}
}