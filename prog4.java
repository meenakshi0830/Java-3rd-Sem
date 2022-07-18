import java.util.*;
abstract class shape{
    double a,b;
    abstract void printArea();
}
class rectangle extends shape{
    void getdata(double x, double y){
        a=x;
        b=y;
    }
    @Override
    void printArea() {
        System.out.println("the area of rectangle is: " +(a*b));        
    }
}
class triangle extends shape{
    void getdata(double x,double y){
        a=x;b=y;
    }
    @Override
    void printArea(){
        System.out.println("The area of triangle is: " + (0.5*a*b));
    }
}
class circle extends shape{
    void getdata(double x){
        a=x;b=x;
    }
    @Override
    void printArea(){
        System.out.println("The area of the circle is: " + (3.14159*a*b));
    }
}
public class prog4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice;
        double x,y;
        rectangle r = new rectangle();
        triangle t = new triangle();
        circle c = new circle();
        do{
            System.out.println("Enter the choice:\n1.Rectangle \n2.Triangle\n3.Circle\n4.Exit");
            choice = sc.nextInt();
            switch(choice){
                case 1 :    System.out.println("Enter dimension of rectangle:");
                            x=sc.nextDouble();
                            y=sc.nextDouble();
                            r.getdata(x, y);
                            r.printArea();
                            break;
                case 2 :    System.out.println("Enter dimension of triangle:");
                            x=sc.nextDouble();
                            y=sc.nextDouble();
                            t.getdata(x, y);
                            t.printArea();
                            break;
                case 3 :    System.out.println("Enter dimension of circle:");
                            x=sc.nextDouble();
                            c.getdata(x);
                            c.printArea();
                            break;
                case 4 :    System.out.println("Exiting...");
                            break;
            }
        }while(choice != 4);
        sc.close();
    }
}
