//Write a java program using the exception handling concept for the following UML diagram.  
//Note: For each operation you should use proper condition and insert proper value to each field
//By Rudra Kumar Dubey 
//20BCE10897

import java.util.*;

class Bank_Main{
    int amount = 3000; // Intialising Balance as 3000
    public void initiate()
    {
        Bank_Security Bank_Security_id = new Bank_Security(); // this is for Bank_Security
        try{
            Bank_Security_id.acceptInput();
            Bank_Security_id.verify();
            
        }catch(Exception e)  // Exception is used here
        {
            try{
                Bank_Security_id.acceptInput();
                Bank_Security_id.verify();
                
            }catch(Exception f)
            {
               
             }
        }
    }

    //This will tell you the current amount in bank
    public int getBalance(){
        return amount;
    }

    //This will deposit or add fund to your account
    public void add(int amt){
        amount = amount + amt;
        System.out.println("Amount deposited Successfully To Your Account");
        System.out.println(" ");
        System.out.println("Total Balance: " +amount);
        System.out.println(" ");
    }

    //Withdrawing funds from account
    public void withdraw(int amt){
        System.out.println(" ");

        if(amount < amt) // Exception happens when you don't have enough balance 
        {
            InvalidBankTransaction invalidWithDraw = new InvalidBankTransaction("InValid Withdrawal Amount");  
            System.out.println(invalidWithDraw.getMessage());
        }else{
            amount = (amount - amt);
            System.out.println("Please Collect your " + amt +" Rupees");
            System.out.println(" ");
            System.out.println("Total Balance: " +amount);
            System.out.println(" ");
        }
    }

    //This is for transfering amount it takes account number
    public void transfr(int amt){

        int ifsc, ac_num;
        Scanner trnsfr = new Scanner(System.in);
    
        System.out.println("Enter Account number: ");
        ac_num = trnsfr.nextInt();
    
        if(amount < amt)
        {
            InvalidBankTransaction invalidWithDraw = new InvalidBankTransaction("InValid Withdrawal Amount");
            System.out.println(invalidWithDraw.getMessage());
        }else{
            amount = (amount - amt);
            System.out.println("Amount of " + amt +" Rupees transferred to  A/C: "+ac_num);
            System.out.println(" ");
            System.out.println("Total Balance: " +amount);
            System.out.println(" ");
        }
    }
    
}


//Gets Bank_Security details of Customer or Maintanace Staff 
class Bank_Security{
    int ac_number = 392167;
    int ac_pass = 1234;
    int main_number = 1004;
    int main_pass = 4321;
    int ac,flg;
    int pw;
    int main_id;
    int main_pw;

    //Getting data
    public void acceptInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Customer \n2. Maintanace staff");
        flg = scanner.nextInt();

        if(flg == 1){
            System.out.println("Enter the account number:");
            ac = scanner.nextInt();

            System.out.println("Enter the Password:");
            pw = scanner.nextInt();
        }
        if(flg == 2){
            System.out.println("Enter the account number:");
            main_id = scanner.nextInt();
    
            System.out.println("Enter the Password:");
            main_pw = scanner.nextInt();   
        }

    }

    //Verifying data
    public void verify() throws Exception{
        Scanner scnr = new Scanner(System.in);
        if(flg == 1){

            if(ac == ac_number && pw == ac_pass)
            {
                System.out.println("Bank_Security Successfull!");
    
                Bank_Main Bank_Main = new Bank_Main();
                System.out.println(" ");
                System.out.println("Your Balance is: "+Bank_Main.getBalance()+"  Rupees");
                System.out.println(" ");
                User_Interface User_Interface = new User_Interface();
                User_Interface.showUser_Interface();
            }
            else{
                InvalidBankTransaction Bank_Securityfailed = new InvalidBankTransaction("Incorrect Bank_Security credentials");
                System.out.println(Bank_Securityfailed.getMessage());
                throw Bank_Securityfailed;
            }
        }
        
        if(flg == 2)
        {
            if(main_id == main_number && main_pw == main_pass)
            {
                System.out.println("Bank_Security Successfull!");
                int x = 1;
                while(x == 1){
                    System.out.println("1. Maintanace \n2. Repair");
                    int main_flg = scnr.nextInt();
                    
                    if(main_flg == 1){
                        System.out.println("Maintance in progress...Bank notified");
                        System.out.println("Enter any key to end maintanance");
                        int main_end = scnr.nextInt();
                        System.out.println("Maintanace ended\n Bank Notified");
                        break;
                    }
                    else{
                        System.out.println("Repair in progress...Bank notified...ATM offline");
                        System.out.println("Enter any key to end repair");
                        int main_end = scnr.nextInt();
                        System.out.println("Repair ended, ATM online \nBank Notified");
                        break;
                    }
                }

            }
            else{
                InvalidBankTransaction Bank_Securityfailed = new InvalidBankTransaction("Incorrect Bank_Security credentials");
                System.out.println(Bank_Securityfailed.getMessage());
                throw Bank_Securityfailed;
            }
        }
    }


}

//Deposites funds to account
class Deposit{
    int amt= 0;
    
    public int userInput()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to be deposited: ");
        amt = scanner.nextInt();

        if(amt<=0)
        {
            InvalidBankTransaction depositnegativeError = new InvalidBankTransaction("Invalid Deposit Amount");
            System.out.println(depositnegativeError.getMessage());
            userInput();
           
        }else{   
            return amt;
        }

        return amt;
        
    }

}

//Handles error during transactions and Bank_Securitys like login
class InvalidBankTransaction extends Exception
{
     String errorMessage;
     public InvalidBankTransaction(String message)
     {
        errorMessage = message;
     }  

      public String getMessage()
      {
          return errorMessage;
      }
}

//Crete Interface
class User_Interface{
    int selectedOption;

    Bank_Main Bank_Main = new Bank_Main();

    public void showUser_Interface()
    {
        System.out.println("Please Select an option below:");
        System.out.println("Press 1 to Deposit Amount.");
        System.out.println("Press 2 to Withdraw Amount.");
        System.out.println("Press 3 to Check Balance");
        System.out.println("Press 4 to Transfer Amount");
        System.out.println("Press any key to Exit");
        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);
        System.out.println ("Press any key:");
        selectedOption = scanner.nextInt();


        switch (selectedOption) {
            case 1:
                 Deposit d = new Deposit();
                 int depamt =  d.userInput();

                 Bank_Main.add(depamt);

                 showUser_Interface();

                break;
            case 2:
                 System.out.println("Please Enter the amount to withdraw:");
                 int withamt=scanner.nextInt();
                 Bank_Main.withdraw(withamt);
                 showUser_Interface();
                break;
            case 3:
                  System.out.println("Your Account Balance is "+Bank_Main.getBalance()+" Rupees");
                  System.out.println(" ");  
                  showUser_Interface();
                break;
            case 4:
                System.out.println("Please Enter the amount to withdraw:");
                int trnsamt=scanner.nextInt();
                Bank_Main.transfr(trnsamt);
                showUser_Interface();
                break;
        
            default:
                  System.out.println("Transaction Ended");
                  System.exit(0);
                break;
        }
        
    }

}

//Main Running Program
public class LAB {
    public static void main(String[] args) throws Exception {
        System.out.println("Apna Bank");
        Bank_Main b = new Bank_Main();
        b.initiate();
    }
}