package kr.hs.emirim.amasvin;

import java.util.Scanner;

public class Drink {
	String name;
	int price;
	int[] ices = {0, 50, 100, 150};
	String[] cups = {"레귤러","점보"};
	int ice;
	String cup;

	public Drink(String name, int price) {
		super();
		this.name = name;
		this.price = price;
		cup = cups[0];
		ice = ices[2];
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCup() {
		return "컵 : "+cup;
	}
	public void setCup() {
		System.out.println("컵을 선택하세요.(1. 레귤러, 2. 점보)");
		Scanner scanner = new Scanner(System.in);
		int select = scanner.nextInt();
		cup = cups[select-1];
	}
	public void setIce() {
		System.out.println("얼음양을 선택하세요.(1. 0%, 2. 50%, 3. 100%, 4. 150%)");
		Scanner scanner = new Scanner(System.in);
		int select = scanner.nextInt();
		ice = ices[select-1];
	}
	public String getIce() {
		return "얼음 : "+ice+"%";
	}
	@Override
	public String toString() {
		return name+"\t"+getCup()+"\t"+getIce();
	}
	
	
	
}
