package testthread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Wallmart {
	
	private double total;
	private int count;
	private Lock itemsAndPrice;
	private Condition calculatePrice;
	
	public Wallmart() {
		this.total = 0.0;
		itemsAndPrice = new ReentrantLock();
		calculatePrice = itemsAndPrice.newCondition();
	}
	
	 public void totalPrice(String[] itemNames,double[] price) {
		itemsAndPrice.lock();
		try {
			double newTotal = 0.0;
			count = 0;
			for(int i=0;i<itemNames.length;i++) {
				newTotal = newTotal + price[i];
				count++;
			}
			 total = newTotal;
			 System.out.println("Total price of items : "+total);
			 System.out.println("Total items in cart  : "+count);
			 calculatePrice.signalAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			itemsAndPrice.unlock();
		}
	}

}
