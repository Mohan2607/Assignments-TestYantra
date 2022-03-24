package com.tyss.has$relationship;

public class Laptop {
	String name;
	Rom rom;
	Battery battery;
	double price;
	Screen screen;

	@Override
	public String toString() {
		return "Laptop [name=" + name + ", rom=" + rom + ", battery=" + battery + ", price=" + price + ", screen="
				+ screen + "]";
	}

}
