package kr.hs.emirim.amasvin;

import java.util.Scanner;

public class BubbleTea extends Drink implements PearlSelectable {
	String[] pearls= {"Å¸ÇÇ¿ÀÄ« ÆŞ","ÄÚÄÚ ÆŞ", "Á©¸® ÆŞ", "¾Ë·Î¿¡ ÆŞ"};
	String pearl;

	public BubbleTea(String name, int price) {
		super(name, price);
		pearl = pearls[0];
	}

	@Override
	public void setPearl() {
		System.out.println("ÆŞÀ» ¼±ÅÃÇÏ¼¼¿ä.(1. Å¸ÇÇ¿ÀÄ« ÆŞ, 2. ÄÚÄÚ ÆŞ, 3. Á©¸® ÆŞ, 4. ¾Ë·Î¿¡ ÆŞ)");
		Scanner scanner = new Scanner(System.in);
		int select = scanner.nextInt();
		pearl = pearls[select-1];
		
	}

	@Override
	public String getPearl() {
		return "ÆŞ : "+pearl;
	}

	@Override
	public String toString() {
		return super.toString()+"\t"+getPearl();
	}

	
}
