
public class ShutdownHookes implements Runnable{
	public void run(){
		System.out.println("*** Application shutting down**");
		ShutdownHookes1 hook=new ShutdownHookes1();
		Thread t=new Thread(hook);
		t.start();
		try{
		t.join();}
		catch(Exception e){}
System.out.println("*** After Bacjup***");}}
		class ShutdownHookes1 implements Runnable{
		public void run(){
		System.out.println("*** Taking backup and closing resources***");
		try{
		Thread.sleep(1000*5);}
		catch(Exception e){}
	}
}