package Oops;
import java.util.*;
 interface ABCD{
    double rate =2;
    void calculateinterest();
 }
abstract class BankAccount{
    Scanner sc=new Scanner(System.in);
    int bankaccount,amount;
    long balances=10000;
    String name,mobilenumber;
    public void inputdata(){
        System.out.print("Enter BankAccount number:");
        bankaccount=sc.nextInt();
        System.out.print("Enter Name: ");
        name=sc.next();
        System.out.print("Enter the mobile number: ");
        mobilenumber=sc.next();
    }

    public void display(){
        System.out.println("The Bank Account no is: "+bankaccount);
        System.out.println("The Name is : "+ name);
        System.out.println("The Mobile number is "+mobilenumber);
        System.out.println("The Balance is: "+balances);
    }
    abstract void deposit();
    abstract void withdraw();
}
class SavingAccount extends BankAccount{
    public void deposit(){
        System.out.println("Enter the Amount to deposit: ");
        amount=sc.nextInt();
         if(amount>10000){
            System.out.println("Too much deposit at one time");
        }
        else{
        balances+=amount;
       System.out.println("Amount:"+amount+ "is been deposited in Saving account");}
    }
    public void withdraw(){
        System.out.println("Enter the Amount to Withdraw: ");
        amount=sc.nextInt();
        if((balances-=amount)<1000){
            System.out.println("minimum 1000 rupees balance is needed");
        }
        else{
              balances-=amount;
              System.out.println("Amount:"+amount+ "is been withdraw from Saving account");
        }
    }
}

class CurrentAccount extends BankAccount{
     public void deposit(){
        System.out.println("Enter the Amount to deposit: ");
        amount=sc.nextInt();
        if(amount>10000){
            System.out.println("Too much deposit at one time");
        }
        else{
        balances+=amount;
        System.out.println("Amount:"+amount+ "is been deposited in Current account");}
        
    }
    public void withdraw(){
        System.out.println("Enter the Amount to Withdraw: ");
        amount=sc.nextInt();
        balances-=amount;
        System.out.println("Amount:"+amount+ "is been withdraw from Current account");
    }
}
class Interest1 extends CurrentAccount implements ABCD{
        public void calculateinterest(){
            double a=0.04;
            if(a>rate){
            double b= balances*(a);
            System.out.println("interest on current account is:"+b);}
            else{
                System.out.println("the interest is less");
            }
        }
}
class Interest2 extends SavingAccount implements ABCD{
        public void calculateinterest(){
            double a=0.02;
            if(a>rate){
            double x= balances*(a);
            System.out.println("interest on Saving account is:"+x);}
             else{
                System.out.println("the interest is less");
            }
        }
}
public class Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    // BankAccount bk=new BankAccount();
    Interest1 ca=new Interest1();
    Interest2 sa=new Interest2();
    int n;
    while(true){
        System.out.print("\n\t menu \t"+"\n 1.Input data\n 2.Display\n 3.Current Deposit\n 4.Current Withdraw\n 5.Savingaccount Deposit\n 6.Savingaccount Withdraw\n 7.Interest on Current Account\n 8.Interest on Saving Account\n 9.exit\n -->");
        n=sc.nextInt();
        switch (n) {
            case 1:
                sa.inputdata();
                break;
            case 2:
                sa.display();
                 break;
            case 3:
               ca.deposit();
               break;
            case 4:
               ca.withdraw();
               break;
            case 5:
               sa.deposit();
               break;
            case 6:
                sa.withdraw();
                break;
            case 7:
                ca.calculateinterest();
                break;
            case 8:
               sa.calculateinterest();
               break;
            case 9:
               System.exit(0);
            default:
            System.out.println("invalid input");
                break;
        }
    }
    } 
}
