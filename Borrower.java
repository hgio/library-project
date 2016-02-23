import java.util.ArrayList;
abstract class Borrower{
  public abstract int getID();
  public abstract double getFines();
  public abstract void takeOutBook(Book a);
  public abstract void returnBook(Book b);
  public abstract boolean checkAvailabilityISBN(int isbn);
  public abstract boolean checkAvailabilityTitle(String title);
  public void browse(String c)
  {
    
  }
  
  public ArrayList<String> getBooksOut(ArrayList<Book> out)
  {
    ArrayList<String> borrowedTitles = new ArrayList<String>(out.size());
    for(int i = 0; i < borrowedTitles.size(); i++)
    {
      borrowedTitles.set(i, out.get(i).getTitle());
    }
    return borrowedTitles;
  }
}
