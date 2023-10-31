package ass3;
class A implements Runnable{
	 public void run()
	 {
		 for(int i=0;i<5;i++) {
			 System.out.println("HELLO");
			 try {Thread.sleep(100);}catch(Exception e) {}
			 }
	 }
}
	 class B implements Runnable{
		 public void run() {
			 for(int j=0;j<5;j++) {
				 System.out.println("HI");
				 try {Thread.sleep(100);}catch(Exception e) {}
			 }
		 }
	 
	 }
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 A obj= new A();
		    Thread t=new Thread(obj);
		       t.start();
		       B obj1= new B();
		       Thread t1=new Thread(obj1);
		       t1.start();
	}

}
