import java.util.ArrayList;
public class Student extends Borrower
{
  private int osis;
  private ArrayList<Book> borrowed = new ArrayList<Book>(2);
  
  public Student(int o)
  {
    osis = o;
  }
  
  public int getID()
  {
    return osis;
  }
  
  public double getFines()
  {
    //TO BE IMPLEMENTED
  }
  
  public ArrayList<Book> getBooksOut()
  {
    return borrowed;
  }
  
  /*Checks for a book's availability with the isbn.
   * 
  */
  public boolean checkAvailabilityISBN(int isbn)
  {
    //TO BE IMPLEMENTED
  }
  
  /*Checks for a book's availability with the title.
   * 
  */
  public boolean checkAvailabilityTitle(String title)
  {
    //TO BE IMPLEMENTED
  }
  
  public void returnBook(Book a)
  {
    //TO BE IMPLEMENTED
  }
  
  public void takeOutBook(Book b)
  {
    //TO BE IMPLEMENTED
  }
}