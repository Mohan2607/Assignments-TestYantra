package com.tyss.project;

public class Smartphone extends Phone{
	
	double camera;
	int cameracount;
	public Smartphone(int price,int ram,double cam,int camcount) {
		//super(12000,4);
		
		super(price,ram);
		camera=cam;
		cameracount=camcount;
		//System.out.println("from smartphone that is subclass");
	}
	public Smartphone(int price, int ram) {
		super(price,ram);
	}
	
	public void play() {
		System.out.println("play pubg with friends");
	}
	
	public void selfie() {
		System.out.println("taking selfie");
	}

}
