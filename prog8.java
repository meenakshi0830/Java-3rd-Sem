import java.util.*;

class father{
    Scanner sc = new Scanner(System.in);
    int age1;
    father(){
        System.out.println("Enter fathers age");
        age1 = sc.nextInt();
    }
    void ex1() throws fatherage{
        if (age1<0){
            throw new fatherage();
        }
    }
}
class fatherage extends Exception{
    public String toString(){
        return("Father age is less than zero");
    }
}
class son extends father{
    int age2;
    son(){
        System.out.println("enter sons age");
        age2 = sc.nextInt();
    }
    void ex2() throws sonage{
        if(age2>age1 || age2<0){
            throw new sonage(age2);
        }
    }
}
 class sonage extends Exception{
     int age;
    sonage(int a){
        age = a;
    }
    public String toString(){
        if(age<0){
            return("less than zero");
        }
        else{
            return("Sons age greater than father");
        }
    }
}
public class prog8{
    public static void main(String args[]){
        son s1 = new son();
        try{
            s1.ex1();
        }
        catch(fatherage e){
            System.out.println(e);
        }
        try{
            s1.ex2();
        }
        catch(sonage e){
            System.out.println(e);
        }
    }
}
