package snackBar;

public class Snack {

	// fields (know)
	private static int maxId = 0;
	private int id;

	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineId;

	// constructor
	public Snack(String name, int quantity, double cost, int vendingMachineId) {
		maxId++;
		id = maxId;

		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachineId = vendingMachineId;
	}

	// methods (behaviors)

	// getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public int getVendingMachineId() {
		return vendingMachineId;
	}

	public int getQuantity() {
		return quantity;
	}

	public double totalCost(int totalQuantity) {
		return cost * totalQuantity;
	}

	// setters
	public void setName(String name) {
		this.name = name;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setVendingMachineId(int vendingMachineId) {
		this.vendingMachineId = vendingMachineId;
	}

	public void setQuantity(int setQuantity) {
		this.quantity += setQuantity;
	}

	public void buySnacks(int purchased) {
		this.quantity -= purchased;
	}
}