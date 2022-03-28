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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Walmart w = new Walmart();

        Cashier theCashier1 = new Cashier(w, "Jeevan");
        Cashier theCashier2 = new Cashier(w, "Dhanusha");
        Thread t1 = new Thread(theCashier1);
        Thread t2 = new Thread(theCashier2);

//        t1.start();
//        t2.start();
        
         t1.start();
       t1.join();
       t2.start();
       t2.join();  

    }

}
