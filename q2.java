
package ass3;
import java.util.*;
class workerThread extends Thread{
	int x,y;
	workerThread(int n1,int n2){
		x=n1;
		y=n2;
		
	}
	

public void run() {
	int result = x+y;
	onResult(result);
}
void onResult(int result) {
	System.out.println("recevied result from the thread:"+result);
}
}
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	     int a,b;
	     System.out.println("enter two number");
	     a=sc.nextInt();
	     b=sc.nextInt();
	     workerThread workerThread= new workerThread(a,b);
	     workerThread.start();
	}

}
