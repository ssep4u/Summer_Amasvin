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
		System.out.println("���� �����ϼ���.(1. Ÿ�ǿ�ī ��, 2. ���� ��, 3. ���� ��, 4. �˷ο� ��)");
		Scanner scanner = new Scanner(System.in);
		int select = scanner.nextInt();
		pearl = pearls[select-1];
		
	}

	@Override
	public String getPearl() {
		return "�� : "+pearl;
	}

	@Override
	public String toString() {
		return super.toString()+"\t"+getPearl();
	}

	
}
