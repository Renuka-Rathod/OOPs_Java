package com.code;

public class MyCar {
	private int id;
	private String name;
	private FuelType fuel;
	private Color color;
	public MyCar(int id, String name, String  fuel, String color) {
		super();
		this.id = id;
		this.name = name;
		//convert String value into ENUM using valueOf()
		this.fuel =FuelType.valueOf(fuel);
		this.color =Color.valueOf(color);
	}
	@Override
	public String toString() {
		return "MyCar [id=" + id + ", name=" + name + ", fuel=" + fuel + ", color=" + color + "]";
	}
	
	
	

}
