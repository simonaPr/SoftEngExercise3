package it.polito.inventory;

import java.util.LinkedList;
import java.util.List;

//descriptor of items in inventory
public class Item {  
	private String itemCode; // aka bar code, unique identifier of item
	private int availability; // number of items available
	private String description; // description of item
	private String name; // name of item
	private List<Supplier> suppliers;

	// creates a new item
	public Item(String itemCode, int quantity){
		this.itemCode = itemCode;
		this.availability = quantity;
		suppliers = new LinkedList<>();
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public int getAvailability() {
		return availability;
	}

	public void setAvailability(int availability) {
		this.availability = availability;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Supplier> getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(List<Supplier> suppliers) {
		this.suppliers = suppliers;
	} 
	
	public void addSupplier(Supplier s){
		this.suppliers.add(s);
	}
}