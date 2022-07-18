import java.util.*;
class book{
    String name,author;
    int price,num_pages;
    book(){

    }
    book(String name,String author,int price,int num_pages){
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }    
    public void accept(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name of the book");
        name = s.nextLine();
        System.out.println("Enter the author of the book");
        author = s.nextLine();
        System.out.println("Enter the number of pages");
        num_pages = s.nextInt();
        System.out.println("Enter the price of the book");
        price = s.nextInt();
        s.close();
    }
    public String toString(){
        return("Name: " + name + "\nAuthor: " + author + "\nNumber of pages: " + num_pages + "Price: " + price);
    }
}
public class prog3 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        book b1 = new book("Krshna", "Amish", 900, 300);
        System.out.println("parameterised constructor: " + b1);
        System.out.println("Enter the number of books");
        int n = input.nextInt();
        book[] ob = new book[n];
        for(int i = 0 ; i < n ; i++){
            ob[i] = new book();
            System.out.println("Enter the details of book " + (i+1));
            ob[i].accept();
        }
        for(int i = 0 ; i < n ; i++){
            System.out.println("Details of book number " + (i+1));
            System.out.println(ob[i]);
        }
        input.close();
    }
}
