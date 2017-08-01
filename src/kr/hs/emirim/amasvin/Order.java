package kr.hs.emirim.amasvin;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {
	ArrayList<Drink> orderDrinks = new ArrayList<Drink>();
	ArrayList<Drink> menus;
	
	public Order(ArrayList<Drink> menus) {
		this.menus = menus;
	}
	public boolean order() {
		
		return true;
	}
	public void getOrderDrinks() {
	}
	public int getPrice() {
		int price = 0;
		return price;
	}

}
