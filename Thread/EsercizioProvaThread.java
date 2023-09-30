package Thread;

public class EsercizioProvaThread extends Thread {
	
	public EsercizioProvaThread(String str) 
	{
		super(str);
	}
	
	
	public void run() 
	{
		for(int i = 0; i < 10; i++) 
		{
			System.out.println(i + " " + getName());
            System.out.println();
			try 
			{
				sleep((int) (Math.random() * 1000));
			}
			catch(InterruptedException e) {}
		}
		System.out.println("FINE TRHEAD! " + getName());
	}
	
	
	public class RunTest
	{
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			new EsercizioProvaThread("Primo Thread").start();
			new EsercizioProvaThread("Secondo Thread").start();
		}
	}
}