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
    public ArrayList<String> getBooksOut()
  {
    ArrayList<String> borrowedTitles = new ArrayList<String>(borrowed.size());
    for(int i = 0; i < borrowedTitles.size(); i++)
    {
      borrowedTitles.set(i, borrowed.get(i).getTitle());
    }
    return borrowedTitles;
  }
  
}
