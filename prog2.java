import java.util.Scanner;

class student{
    String usn,name;
    double sgpa;
    int[] credits = new int[5];
    int[] marks = new int[5];
    public void set(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter usn:");
        usn = sc.nextLine();
        System.out.println("enter name:");
        name = sc.nextLine();
        for(int i=0;i<5;i++){
            System.out.println("Enter marks and total credits of the subject " +(i+1));
            marks[i] = sc.nextInt();
            credits[i] = sc.nextInt();
        }
        sc.close();
    }
    public void compute(){
        int sum = 0,sum_credits = 0;
        for(int i=0;i<5;i++){
            if(marks[i]>=90){
                sum = sum+(credits[i]*10);
            }
            else if(marks[i] >= 80){
                sum = sum + (credits[i]*9);
            }
            else if(marks[i] >= 70){
                sum = sum + (credits[i]*8);
            }
            else if(marks[i] >= 60){
                sum = sum + (credits[i]*7);
            }
            else if(marks[i] >= 50){
                sum = sum + (credits[i]*6);
            }
            else if(marks[i] >= 40){
                sum = sum + (credits[i]*5);
            }
            else{
                sum = sum + 0;
            }
            sum_credits = sum_credits + credits[i];
        }
        sgpa = sum/sum_credits;
    }
    public void display(){
        System.out.println("Name = " + name);
        System.out.println("USN = " + usn);
        System.out.println("SGPA = " + sgpa);
    }
}
public class prog2 {
    public static void main(String args[]){
        Scanner input = new Scanner("System.in");
        System.out.println("enter the number of students");
        int n =input.nextInt();
        student[] obj = new student[n];
        for(int i = 0;i<0;i++){
            obj[i] = new student();
            System.out.println("Enter detail of student " + (i+1));
            obj[i].set();
        }
        for(int i = 0;i<0;i++){
            obj[i].compute();
        }
        for(int i = 0;i<0;i++){
            System.out.println("the details and marks of student " + (i+1) + "are: ");
            obj[i].display();
        }
        input.close();

    }
}
