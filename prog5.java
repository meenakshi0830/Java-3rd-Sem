import java.util.Scanner;
import java.lang.Math;
class bank{
    String name;
    int acc_no;
    float bal,si;
    void accept(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of account holder: ");
        name=scan.nextLine();
        System.out.println("Enter account number: ");
        acc_no =scan.nextInt();
        System.out.println("Enter account balcnce: ");
        bal=scan.nextFloat();
        //scan.close();
    }
    void display(){
        System.out.println("Details");
        System.out.println("Name: "+name+"\nAccount number: "+acc_no + "\nBalance: "+bal);

    }
    void deposit(){
        Scanner scan =new Scanner(System.in);
        System.out.println("Do you want to deposit (1 for yes     2 for no");
        int d=scan.nextInt();
        if(d==1){
            System.out.println("Enter the amount to be deposited: ");
            int amt =scan.nextInt();
            bal=bal+amt;
            System.out.println("Available balnce: "+ bal);
        }
        //scan.close();
    }
}
class savings extends bank{
    void cheque(){
        System.out.println("\nNo cheque service");
    }
    void simple_intrest(){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter rate of intrest: ");
        int r=scan.nextInt();
        System.out.println("enter the number of times intrest applied per time period");
        int n=scan.nextInt();
        System.out.println("enter the time elapse: ");
        int t=scan.nextInt();
        si=bal*(1+r/n);
        System.out.println("Simple intrest =Rs " + (Math.pow(si,n*t)));
        //scan.close();
    }
    void withdrawal(){
        float amount;
        Scanner scan =new Scanner(System.in);
        System.out.println("No minimum balance required");
        System.out.println("enter the amount to be withdrawn");
        amount = scan.nextFloat();
        if(amount>bal){
            System.out.println("insufficient balance");
        }
        else{
            bal = bal-amount;
            System.out.println(amount + " withdrwan");
            System.out.println("Available balance= "+bal);
        }
        //scan.close();
    }
}
class current extends bank{
    float service_charge =100;
    void cheque(){
        System.out.println("Cheque service is available");
    }
    void withdrawal(){
        float amount;
        Scanner scan = new Scanner(System.in);
        System.out.println("minimum balance is Rs.1000");
        System.out.println("Enter the amount to be withdrawn: ");
        amount =scan.nextFloat();
        if(amount>bal){
            System.out.println("insufficient balance");
        }
        else{
            bal = bal-amount;
            if(bal<1000){
                bal = bal- service_charge;
                System.out.println("Service charge "+ service_charge + " is added");
                System.out.println("Available balance = "+ bal);
            }
        }
        //scan.close();
    }
}
public class prog5{
    public static void main(String args[]){
        savings obj1 = new savings();
        current obj2 = new current();
        System.out.println("1.Savings");
        System.out.println("2.Current");
        System.out.println("Enter your choice: ");
        Scanner scan = new Scanner(System.in);
        int ch = scan.nextInt();
        switch(ch){
            case 1 :obj1=new savings();
                    obj1.accept();
                    obj1.display();
                    obj1.cheque();
                    obj1.simple_intrest();
                    obj1.withdrawal();
                    break;
            case 2 :obj2=new current();
                    obj2.accept();
                    obj2.display();
                    obj2.cheque();
                    obj2.deposit();
                    obj2.withdrawal();
                    break;
            default:System.out.println("Invalid input");
        }
        //scan.close();
    }
}

