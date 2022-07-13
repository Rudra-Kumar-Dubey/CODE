import java.io.*;
import java.util.*;

public class Progam1 {
    public static void main(String args[])throws IOException
    {
        //InputStreamReader ip = new InputStreamReader(System.in);
        //BufferedReader br = new BufferedReader(ip);
        try (Scanner sc = new Scanner(System.in)) {
            char choice;
            int choice2;
            int choice3;
            float number1;
            int number2;
            
            while(true){
                choice3 = sc.nextInt();
                if(choice3 == 1){
                    System.out.println("Enter a Character ");
                    char a = sc.next().charAt(0);
                    if(a!=' ')
                    {
                        switch(a)
                        {
                            case 'a':
                                System.out.println("The Character \"" +a +"\" you entered is a vowel");
                                break;
                            case 'e':
                                System.out.println("The Character " +a +" you entered is a vowel");
                                break;
                            case 'i':
                                System.out.println("The Character " +a +" you entered is a vowel");
                                break;
                            case 'o':
                                System.out.println("The Character " +a +" you entered is a vowel");
                                break;
                            case 'u':
                                System.out.println("The Character " +a +" you entered is a vowel");
                                break;
                            default:
                                System.out.println("The Character is a consonant ");
                                break;
                        }
                        
                    }
                }
                else if(choice3==2){
                    System.out.println("Enter your choice: ");
                    choice2 = sc.nextInt();
                    if(choice2==1){
                        System.out.println("Enter a Number: ");
                        number1 = sc.nextFloat();
                        float i=0;
                        System.out.println("Your entered number is " +number1);
                        do{
                            System.out.print(i + " ");
                            i++;
                        }while(i<=number1);
                    }

                    else if(choice2==2){
                        System.out.println("Enter a Number: ");
                        number2 = sc.nextInt();
                        System.out.println("Your entered number is " +number2);
                        for(int i=0; i<=number2;i++){
                            System.out.print(i + " ");
                        }
                    }
                    
                }
                else{
                    System.out.println("Wrong Choice. Try Again!!!");
                }
                
                System.out.println();
                System.out.print("Do you wish to continue? ");
                choice = sc.next().charAt(0);
                if(choice=='y') continue;
                else break;
            }
        }
    }
}
