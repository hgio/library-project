import java.util.ArrayList;
public class Teacher extends Borrower
{
  private int id;
  
  public Teacher(int i, String n)
  {
    super(n);
    id = i;
    borrowed = new ArrayList<Book>(4);
  }
  
  public int getID()
  {
    return id;
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
