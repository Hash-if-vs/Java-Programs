package sub_programs;
class NewThread implements Runnable
{
 String name;
 Thread t;
 NewThread (String threadname)
 {
  name=threadname;
  t=new Thread(this, name);
  System.out.println("New thread: " + t);
  t.start();
 }

public void run ()
 {
  try
   {
  for (int i=6;i>0;i--)
  {
   System.out.println (name + ": " + i);
   Thread.sleep (500);
  }
 }
  catch (InterruptedException e)
   {
  System.out.println (name + "Interrupted");
 }
 System.out.println (name + " exiting.");
 }
 }

public class Thread3 {

public static void main(String[] args) {
  // TODO Auto-generated method stub
   NewThread ob1 = new NewThread("One");
   NewThread ob2 = new NewThread("Two");
   NewThread ob3 = new NewThread("Three");
   try {
  Thread.sleep(1000);
  ob1.t.suspend();
  System.out.println ("Suspending Thread One");
   Thread.sleep(1000);
  ob1.t.resume();
  System.out.println ("Resuming Thread One");
  ob2.t.suspend();
  System.out.println ("Suspending Thread Two");
  Thread.sleep(1000);
  ob2.t.resume();
  System.out.println ("Resuming Thread Two");
  ob3.t.suspend();
  System.out.println ("Suspending Thread Three");
  Thread.sleep(1000);
  ob2.t.resume();
  System.out.println ("Resuming Thread Three");
   }catch(InterruptedException e)  {
  System.out.println("Main thread Interrupted");
   }
 
    try
    {
    System.out.println("Waiting for the Threads to Finish.");
    ob1.t.join();
    ob2.t.join();
    ob3.t.join();
    }
   
    catch (InterruptedException e)
     {
   System.out.println("Main thread Interrupted");
     }
     System.out.println("Main thread exiting.");
     }
   

 }
