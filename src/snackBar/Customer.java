package snackBar;

public class Customer {
	private static int maxId = 0;
	private int id;

	private String name;
	private double cashOnHand;

	// constructor
	public Customer(String name, double cashOnHand) {
		maxId++;
		id = maxId;

		this.name = name;
		this.cashOnHand = cashOnHand;
	}

	// setters
	public int getId() {
		return id;
	}

	public double getCashOnHand() {
		return cashOnHand;
	}

	public String getName() {
		return name;
	}

	// getters
	public void setName(String name) {
		this.name = name;
	}

	public void addCash(double addCash) {
		this.cashOnHand += addCash;
	}

	public void buySnacks(double price) {
		this.cashOnHand = this.cashOnHand - price;
	}
}