package it.polito.inventory;

public class Supplier {
	private String name;
	private String place;
	
	public Supplier(String name, String place) {
		//super();
		this.name = name;
		this.place = place;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString(){
		return this.getName() + " @ " + this.getPlace();
	}
}
