/*All the banks operating in India are controlled by RBI. 
RBI has set a well defined guideline (e.g. minimum interest rate, 
minimum balance allowed, maximum withdrawal limit etc) which all banks must follow. 
For example, suppose RBI has set minimum interest rate applicable to a 
saving bank account to be 4% annually; however, banks are free to use 4% interest rate or to set any rates above it.
Write a JAVA program to implement bank functionality in the above scenario and demonstrate the dynamic polymorphism concept. 
Note: Create few classes namely Customer, Account, RBI (Base Class) and few derived classes (SBI, p, PNB etc). 
Assume and implement required member variables and functions in each class.*/

class Customer
{
  String name, address;
  int age;
}

class Account
{
  String accType, branchName;
}

class RBI  
{       
  int Limit, n;
  double Amount, Principal, rate;
  float time;
  long avg, tot, mab,mib;

  int WithdrawalLimit ()
  {
    // int limit = 6000;
    return 6000;
  }

  double InterestRate ()
  {
    Amount = (Principal + rate) / n * time;
    return Amount;
  }

  long setMAB ()
  {
    mab = (avg * tot) / 31;
    return mab;
  }
  
}

class SBI extends RBI  
{       
  double InterestRate ()
  {
    Amount = Principal * (1 + rate / n) + n * time;
    return Amount;
  }
  long setMAB ()
  {
    mab = (avg + tot) / 30;
    return mab;
  }
}

class PNB extends RBI  
{       
  double InterestRate ()
  {
    Amount = (Principal * rate) / n + time;
    return Amount;
  }

  int WithdrawalLimit ()
  {
    Limit = 7000;
    return Limit;
  }
  
  long setMIB(){
      mib = (avg*tot)/9500;
      return mib;
  }
}


public class ClassQ6   
{       
  public static void main (String args[])
  {
    
    SBI sbi = new SBI ();
    PNB p = new PNB ();
    sbi.Principal = 14.897;
    sbi.rate = 6.92;
    sbi.n = 4;
    sbi.time = 8;

    p.avg= 3978;
    p.tot = 11087;

    Double sbiInt = sbi.InterestRate ();
    System.out.println ("SBI interest rate is:" + sbiInt);


    int PNBWL = p.WithdrawalLimit ();
    System.out.println ("PNB withdraw limit is:" + PNBWL);
  }
}