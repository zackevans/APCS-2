/**
   A class to test the CashRegister class.
*/
public class CashRegisterTester
{
   public static void main(String[] args)
   {
      CashRegister register = new CashRegister();
      
      register.recordPurchase(29.50);
      register.recordPurchase(9.25);
      //register.enterPayment(50);
      
      register.enterDollars(50);
      register.enterQuarters(0);
      register.enterDimes(0);
      register.enterNickels(0);
      register.enterPennies(0);
      double items = register.getItems();
      double change = register.giveChange();

      System.out.println("Change: " + change);    
      System.out.println("Items:" + items);
      
      
      //System.out.println("Expected: 11.25");          
   }
}
