/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testThread;

/**
 *
 * @author Jeevan Bodigam
 */
public class Walmart {

    private double total;
    private int count;

    public Walmart() {
        total = 0.0;

    }

    synchronized public void totalPrice(String[] items, double[] prices) {
        double newTotal = 0.0;
        for (int i = 0; i < items.length; i++) {
            newTotal += prices[i];
            
        }
        count++;
        total = newTotal;
//        System.out.println("The total Amount is :" + newTotal);
//        System.out.println("The total count is :" + count);

    }

    public double getTotal() {
        return total;
    }

}
