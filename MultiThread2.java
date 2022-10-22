package sub_programs;
class In extends Thread
{
    public void run()
    {
     for(int i=1;i<=5;i++)
    {
     try
     {
System.out.print(i+"\n");
Thread.sleep(1000);
}
catch(Exception e)
{
    System.out.print(e);
  }
 }
}
}
       class Al extends Thread
     {
public void run()
{
      for(char i='a';i<='e';i++)
     {
  try
 {
System.out.print(i+"\n");
Thread.sleep(1000);
}
       catch(Exception e)
     {
       System.out.print(e);
     }
    }
  }
}

public class MultiThread2 {

	public static void main(String[] args) {
		In num=new In();
		Al alp=new Al();
		try
		{
		num.start();
		alp.start();
		num.join();
		alp.join();
		}
		catch(Exception e)
		{
		System.out.println(e);

		}
}
}
