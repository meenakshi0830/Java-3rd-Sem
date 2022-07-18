class NewThread implements Runnable
{
   String name;
   int time;
   int x;
   Thread t;
   NewThread(String name, int time, int x)
   {
      this.name = name;
      this.time = time;
      this.x = x;
      t = new Thread(this, name);
   }
   public void run()
   {
      try 
      {
         while(true)
         {
            System.out.println(name);
            Thread.sleep(time);
         }
      }
      catch(InterruptedException e)
      {
         System.out.println(name + "interrupted");
      }
   }
}
public class prog9
{
   public static void main(String args[])
   {
      NewThread n1 = new NewThread("BMS College of Engineering", 10000, 2);
      NewThread n2 = new NewThread("CSE", 2000, 10);
      n1.t.start();
      n2.t.start();
   }
}