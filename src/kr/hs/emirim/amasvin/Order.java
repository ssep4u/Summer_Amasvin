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
		//�� �� ����?
		//�� ������?
		//��?
		//����?
		int number=1;
		for (Drink drink : menus) {
			System.out.println((number++)+". "+drink.getName()+"\t"+drink.getPrice());
		}
		System.out.println("�� �� ���� �ֹ��Ͻðڽ��ϱ�?(0 : ��)");
		Scanner scanner = new Scanner(System.in);
		int drink = scanner.nextInt();
		
		if (drink==0) return false;
		
		Drink orderDrink = menus.get(drink-1);
		orderDrink.setCup();
		if(orderDrink instanceof PearlSelectable) {
			((PearlSelectable) orderDrink).setPearl();
		}
		orderDrink.setIce();
		orderDrinks.add(orderDrink);
		
		return true;
	}
	public void getOrderDrinks() {
		for (Drink drink : orderDrinks) {
			System.out.println(drink);
		}
	}
	public int getPrice() {
		int price = 0;
		for (Drink drink : orderDrinks) {
			price+=drink.getPrice();
		}
		return price;
	}

}
