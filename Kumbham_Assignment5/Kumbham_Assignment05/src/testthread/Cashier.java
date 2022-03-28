package testthread;

import java.util.Scanner;

public class Cashier implements Runnable {
	
	private Wallmart objWallmart;
	private String name;
	
	public Cashier(Wallmart objWallmart1, String name1) {
		objWallmart = objWallmart1;
		name = name1;
	}

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter items of your choice in int");
		int choice = scan.nextInt();
		String[] items = new String[choice];
		double[] price = new double[choice];
		System.out.println("Enter item names of your choice with space : ");
		for(int i=0;i<choice;i++) {
			items[i] = scan.next();
		}
		System.out.println("Enter price for items of your choice with space : ");
		for(int i=0;i<choice;i++) {
			price[i] = scan.nextDouble();
		}
		objWallmart.totalPrice(items, price);
	}

}
