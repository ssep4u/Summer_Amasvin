package kr.hs.emirim.amasvin;

import java.util.ArrayList;
import java.util.Scanner;

public class Amasvin {

	public static void main(String[] args) {
		ArrayList<Drink> menus = new ArrayList<Drink>();
		//음료 생성
		menus.add(new Coffee("아메리카노", 1800));
		menus.add(new Coffee("카페라떼", 2800));
		menus.add(new Coffee("카푸치노", 2800));
		
		menus.add(new BubbleTea("오리지널 밀크티", 2900));
		menus.add(new BubbleTea("녹차 버블티", 3500));
		menus.add(new BubbleTea("딸기 요거트 버블티", 3500));
		
		//주문
		Order order = new Order(menus);
		while(order.order()) {
			;
		}
		order.getOrderDrinks();
		
		//계산
		System.out.println("가격 : "+order.getPrice());
		System.out.println("내실 금액은?");
		Scanner scanner = new Scanner(System.in);
		int cash = scanner.nextInt();
		System.out.println("거스름돈 : "+rest(order.getPrice(), cash));
	}

	private static String rest(int price, int cash) {
		int 만원=0;
		int 오천원 = 0;
		int 천원 = 0;
		int 오백원 = 0;
		int 백원 = 0;
		
		int rest = cash-price;
		while((rest-10000)>=0) {
			만원++;
			rest-=10000;
		}
		while((rest-5000)>=0) {
			오천원++;
			rest-=5000;
		}
		while((rest-1000)>=0) {
			천원++;
			rest-=1000;
		}
		while((rest-500)>=0) {
			오백원++;
			rest-=500;
		}
		while((rest-100)>=0) {
			백원++;
			rest-=100;
		}
	
		return rest+"원\n"+"만원 : "+만원+"\t오천원 : "+오천원+"\t천원 : "+천원+"\t오백원 : "+오백원+"\t백원 : "+백원;
	}

}
