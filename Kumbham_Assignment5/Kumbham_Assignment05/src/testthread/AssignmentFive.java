package testthread;

public class AssignmentFive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Wallmart objTest = new Wallmart();
        Cashier objTest1 = new Cashier(objTest,"Nithin");
        Cashier objTest2 = new Cashier(objTest,"Niteesh");
        Thread t1 = new Thread(objTest1);
        Thread t2 = new Thread(objTest2);
        t1.start();
        t1.join();
        t2.start();
        t2.join();  
	}

}
