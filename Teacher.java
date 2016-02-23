import java.util.ArrayList;
public class Teacher extends Borrower
{
  private int id;
  private ArrayList<Book> borrowed = new ArrayList<Book>(4);
  public Teacher(int i)
  {
    id = i;
  }
  
  public int getID()
  {
    return id;
  }
  
  public double getFines()
  {
    //TO BE IMPLEMENTED
  }
  
  public ArrayList<String> getBooksOut()
  {
    ArrayList<String> borrowedTitles = new ArrayList<String>(borrowed.size());
    for(int i = 0; i < borrowedTitles.size(); i++)
    {
      borrowedTitles.set(i, borrowed.get(i).getTitle());
    }
    return borrowedTitles;
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