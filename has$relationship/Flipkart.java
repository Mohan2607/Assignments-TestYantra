package com.tyss.has$relationship;

public class Flipkart {
	public static void main(String[] args) {
		Laptop laptop = new Laptop();

		Battery battery = new Battery();
		battery.brand = "xyz";
		battery.capacity = 20000;
		battery.type = "lithium";
		
		Rom rom = new Rom();
		rom.clockspeed = 2.4;
		rom.type = "DDR4";
		rom.size = 256;

		Screen screen = new Screen();
		screen.brand = "samsung";
		screen.resolution = 4;
		screen.size = 32;
		screen.type = "OLED";

		laptop.name = "hp";
		laptop.price = 100000;
		laptop.battery = battery;
		laptop.screen = screen;
		laptop.rom = rom;
		System.out.println(laptop);

	}

}
