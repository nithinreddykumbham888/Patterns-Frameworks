/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testThread;

import java.util.Scanner;

/**
 *
 * @author Jeevan Bodigam
 */
public class Cashier implements Runnable {

    private Walmart objWallmart;

    String name;

    Scanner scan = new Scanner(System.in);
    private boolean threadRunning;

    public Cashier(Walmart objWallmart, String name) {
        this.objWallmart = objWallmart;
        this.name = name;
    }
     Scanner scanner = new Scanner(System.in);

    @Override
//    public void run(){
    public synchronized void run() {

       
        System.out.println("Please Enter total number of items: ");
        int totalItems = scanner.nextInt();

        double price[] = new double[totalItems];

        String items[] = new String[totalItems];

        for (int i = 0; i < totalItems; i++) {

            System.out.println("Enter Item Name: ");
            String itemName = scanner.next();
            items[i] = itemName;
            System.out.println("Enter Item Price: ");
            double itemPrice = scanner.nextDouble();
            price[i] = itemPrice;
        }
        objWallmart.totalPrice(items, price);
        System.out.println("Total Amount is: " + objWallmart.getTotal());


    }

    boolean isThreadEnded() {
        return threadRunning;
    }
}
