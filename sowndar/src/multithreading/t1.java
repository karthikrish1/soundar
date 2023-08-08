package multithreading;

public class t1 implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// mulithreading: performing multiple tasks by single thread
		// thread=> builtin class=> start stop run
		
		// Runnable 
		
		t1 ob= new t1();
		Thread t= new Thread(ob);
		t.start();
		
		t1 ob1= new t1();
		Thread t1= new Thread(ob1);
		t1.start();

	}

	@Override
	public void run() {
		System.out.println("Task1 is running");
		
	}

}
