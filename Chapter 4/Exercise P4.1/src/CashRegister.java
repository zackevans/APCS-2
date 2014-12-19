/**
   A cash register totals up sales and computes change due.
*/
public class CashRegister
{
   private double purchase;
   private double payment;
   private double items;

   /**
      Constructs a cash register with no money in it.
   */
   public CashRegister()
   {
      purchase = 0;
      payment = 0;
      items = 0;
   }

   /**
      Records the sale of an item.
      @param amount the price of the item
   */
   public void recordPurchase(double amount)
   {
      double total = purchase + amount;
      items++;
      purchase = total;
   }

   /**
      Enters the payment received from the customer.
      @param amount the amount of the payment
   */
   public void enterPayment(double amount)
   {
      payment = amount;
   }

   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public double giveChange()
   {   
      double change = payment - purchase;
      purchase = 0;
      payment = 0;
      return change;
   }
   
   public void enterDollars (int Ammount)
   {
	   payment = payment + Ammount;
   }
   
   public void enterQuarters (double Ammount)
   {
	   Ammount = Ammount *.25;
	   payment = payment + Ammount;
   }
   
   public void enterDimes (double Ammount)
   {
	   Ammount = Ammount *.10;
	   payment = payment + Ammount;
   }
   
   public void enterNickels (double Ammount)
   {
	   Ammount = Ammount *.5;
	   payment = payment + Ammount;
   }
   
   public void enterPennies (double Ammount)
   {
	   Ammount = Ammount *.1;
	   payment = payment + Ammount;
   }
   
   public double getItems ()
   {
	   return items;
   }


}
