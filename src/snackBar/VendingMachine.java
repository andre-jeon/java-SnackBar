package snackBar;

public class VendingMachine {
	public static int maxId = 0;
	public int id;

	public String name;

	// constructor
	public VendingMachine(String name) {
		maxId++;
		id = maxId;

		this.name = name;
	}

	// setters
	public void setName(String name) {
		this.name = name;
	}
	
	// getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}


}