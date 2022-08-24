package com.oop.usb_bluetooth;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer1 = new Computer();
        computer1.UsbWork();

        Laptop laptop1 = new Laptop();
        laptop1.BluetoothWork();
        laptop1.UsbWork();
	}

}
