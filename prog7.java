
class multiple<T,V>{
    T ob1;
    V ob2;
    multiple(T o1,V o2){
        ob1 = o1;
        ob2 = o2; 
    }
    void showType(){
        System.out.println("Type of first : " + ob1.getClass().getName());
        System.out.println("Type of second: " + ob2.getClass().getName());
    }
    T getob1(){
        return ob1;
    }
    V getob2(){
        return ob2;
    }
}
public class prog7 {
    public static void main(String args[]){
        multiple<String,Integer> obj = new multiple<String,Integer>("Helloo", 10);
        obj.getob1();
        obj.getob2();
        obj.showType();
    }
    
}
