package kr.hs.emirim.amasvin;

import java.util.ArrayList;
import java.util.Scanner;

public class Amasvin {

	public static void main(String[] args) {
		ArrayList<Drink> menus = new ArrayList<Drink>();
		//���� ����
		menus.add(new Coffee("�Ƹ޸�ī��", 1800));
		menus.add(new Coffee("ī���", 2800));
		menus.add(new Coffee("īǪġ��", 2800));
		
		menus.add(new BubbleTea("�������� ��ũƼ", 2900));
		menus.add(new BubbleTea("���� ����Ƽ", 3500));
		menus.add(new BubbleTea("���� ���Ʈ ����Ƽ", 3500));
		
		//�ֹ�
		Order order = new Order(menus);
		while(order.order()) {
			;
		}
		order.getOrderDrinks();
		
		//���
		System.out.println("���� : "+order.getPrice());
		System.out.println("���� �ݾ���?");
		Scanner scanner = new Scanner(System.in);
		int cash = scanner.nextInt();
		System.out.println("�Ž����� : "+rest(order.getPrice(), cash));
	}

	private static String rest(int price, int cash) {
		int ����=0;
		int ��õ�� = 0;
		int õ�� = 0;
		int ����� = 0;
		int ��� = 0;
		
		int rest = cash-price;
		while((rest-10000)>=0) {
			����++;
			rest-=10000;
		}
		while((rest-5000)>=0) {
			��õ��++;
			rest-=5000;
		}
		while((rest-1000)>=0) {
			õ��++;
			rest-=1000;
		}
		while((rest-500)>=0) {
			�����++;
			rest-=500;
		}
		while((rest-100)>=0) {
			���++;
			rest-=100;
		}
	
		return rest+"��\n"+"���� : "+����+"\t��õ�� : "+��õ��+"\tõ�� : "+õ��+"\t����� : "+�����+"\t��� : "+���;
	}

}
