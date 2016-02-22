import java.util.ArrayList;
public class BookTester {
  
  
  public static void main(String[] args) { 
    Book test = new Book(1,"hi","Myles","horror","new");
    ArrayList<Book> r = test.makeBooks("Books.txt");
    
    for(int i = 0; i < r.size(); i++){
    //  System.out.print("is done" + r.size());
      System.out.println(r.get(i).toString());}
  }
  
  /* ADD YOUR CODE HERE */
  
}
