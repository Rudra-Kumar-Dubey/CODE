import java.util.Scanner;
class Customer {
 int balance;
 Scanner s = new Scanner(System.in);
 Customer(int bal){
 try {
 if (bal >= 0) {
 balance = bal;
 } else {
 throw new IllegalArgumentException("Balance cannot be negative");
 }
 }catch(Exception e){
 System.out.println(e);
 }
 }
 public void deposit(){
 System.out.print("Amount of money to be deposited : ");
 int deposit = s.nextInt();
 try{
 if(deposit>=0){
 System.out.println("Money deposited");
 balance = balance+deposit;
 }
 else{
 throw new IllegalArgumentException("Deposit can't be in negative");
 }
 }catch(Exception e){
 System.out.println(e);
 }
 }
 public void withdraw(){
 System.out.print("Amount of money to be withdrawn : ");
 int withdraw = s.nextInt();
 try{
 if(withdraw>=0&& balance>withdraw){
 System.out.println("Money withdrawn");
 balance = balance - withdraw;
 }
 else{
 throw new IllegalArgumentException("Cannot Withdraw");
 }
 }catch(Exception e){
 System.out.println(e);
 }
 }
 public void transfer_funds() {
 System.out.print("Amount to be transfered : ");
 int transfer_price = s.nextInt();
 try {
 if (transfer_price >= 0 && balance >= transfer_price) {
 System.out.println("Funds transfered successfully");
 balance = balance - transfer_price;
 } else {
 throw new IllegalArgumentException("Funds Transfer Failed");
 }
 } catch (Exception e) {
 System.out.println(e);
 }
 }
 public String toString(){
 return ("Your current balance is "+balance);
 }
}
class atm_technician {
 Scanner s = new Scanner(System.in);
 public void repair(){
 System.out.print("Enter valid ATM TECHNICIAN id : ");
 int id = s.nextInt();
 try{
 if(799==id){
 System.out.println("access granted, technician can repair ATM");
 }
 else{
 throw new IllegalArgumentException("access denied");
 }
 }catch(Exception e){
 System.out.println(e);
 }
 }
 public void Maintenance(){
 System.out.print("Enter valid ATM TECHNICIAN id : ");
 int id = s.nextInt();
 try{
 if(799==id){
 System.out.println("access granted, technician can look for ATM Maintenance");
 }
 else{
 throw new IllegalArgumentException("access denied");
 }
 }catch(Exception e){
 System.out.println(e);
 }
 }
}
public class abcBank {
 public static void main(String[] args) {
 Customer c = new Customer(50000);
 c.deposit();
 System.out.println(c);
 c.withdraw();
 System.out.println(c);
 c.transfer_funds();
 System.out.println(c);
 atm_technician a = new atm_technician();
 a.repair();
 a.Maintenance();
 }
}

public class LAB2 {
    
}
