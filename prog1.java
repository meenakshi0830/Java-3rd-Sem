import java.util.*;
class prog1{
    public static void main(String args[]){
        double a,b,c;
        double d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coefficients: ");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c = sc.nextDouble();
        d = Math.sqrt((b*b) - (4*a*c));
        double r1,r2;
        if(d>0){
            if(d==0){
                System.out.println("The roots are real and equal");
            }
            else{
                System.out.println("The roots are real and distinct");
            }
            r1 = ((-b) + d)/(2*a);
            r2 = ((-b) - d)/(2*a);
            System.out.println("The roots are as follows: \n R1= " + r1 + "\n R2= " + r2);
        }
        else{
            System.out.println("The roots are imaginary");
        }
        sc.close();
    }
}