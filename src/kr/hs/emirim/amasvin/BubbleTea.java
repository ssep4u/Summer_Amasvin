package kr.hs.emirim.amasvin;

import java.util.Scanner;

public class BubbleTea extends Drink implements PearlSelectable {
	String[] pearls= {"Ÿ�ǿ�ī ��","���� ��", "���� ��", "�˷ο� ��"};
	String pearl;

	public BubbleTea(String name, int price) {
		super(name, price);
		pearl = pearls[0];
	}

	@Override
	public void setPearl() {
	}

	@Override
	public String getPearl() {
	}

	@Override
	public String toString() {
	}

	
}
