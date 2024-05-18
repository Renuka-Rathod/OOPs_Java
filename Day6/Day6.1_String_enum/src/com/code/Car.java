package com.code;

public class Car {
	private int id;
	private String name,color;
	private String fuel;
	public Car(int id, String name, String color, String fuel) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.fuel = fuel;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", color=" + color + ", fuel=" + fuel + "]";
	}

	
	
}
