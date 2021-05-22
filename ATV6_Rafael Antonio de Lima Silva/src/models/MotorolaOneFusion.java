package models;

import interfaces.*;

public class MotorolaOneFusion implements Camera, Screen, TechnicalData {
	private double price = 1364.00;
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int getCPUCores() {
		return 8;
	}
	
	@Override
	public int getRAMMemory() {
		return 4;
	}
	
	@Override
	public String getType() {
		return "IPS LCD";
	}
	
	@Override
	public String getSizePixel() {
		return "720 x 1600";
	}
	
	@Override
	public int getFrontMegapixel() {
		return 8;
	}
	
	@Override
	public int getRearMegapixel() {
		return 48;
	}

	@Override
	public String toString() {
		return String.format("Motorola One Fusion:\nPrice: %s\nCPU cores: %x\nRAM memory: %x\nScreen resolution: %s\nScreen type: %s\nFront camera: %x Mp\nRear camera: %d Mp", getPrice(),getCPUCores(),getRAMMemory(),getSizePixel(),getType(),getFrontMegapixel(),getRearMegapixel());
	}	
	
	

}
