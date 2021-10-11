import adv.MinBalanceException;

public class UncheckedException  extends Exception{
	 public UncheckedException ()
	  {
	    System.out.println ("Balance is low");
	  }
	}
	 class main
	{
	  public static void main (String[]args)
	  {
	    try
	    {

	      int acc[] = { 100, 101, 102, 103 }; 
	      double balance[] = { 900, 2000, 1500, 1560 };
	      System.out.println ("Account No" + "Balance\t");
	      for (int i = 0; i < 4; i++)
	   {
	     System.out.println (acc[i] + " " + balance[i] + " ");
	     if (balance[i] < 1000)
	     {
	         throw new MinBalanceException (); 
	     }
	   }
	    }
	    catch (MinBalanceException e)
	    {
	      System.out.println ("Exception caught");
	    }
	  }
	}

