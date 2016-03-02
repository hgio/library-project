import java.util.ArrayList;
abstract class Borrower{
  public ArrayList<Book> borrowed;
  private String name;
  
  public Borrower(String n)
  {
    name = n;
  }
  
  public abstract int getID();
  public abstract void takeOutBook(Book a);
  public abstract void returnBook(Book b);
  
  public String getName()
  {
    return name;
  }
  
  public double getFines(int date)
  {
  }
  
  public void browse(String c, ArrayList<String> titles, ArrayList<String> genres)
  {
    for(int i = 0; i < titles.size(); i++)
    {
      if(c.equals(genres.get(i)))
      {
        System.out.println(titles.get(i));
      }
    }
  }
  
  public boolean checkAvailabilityISBN(String isbn, ArrayList<Book> allBooks)
  {
    for(Book b: allBooks)
    {
      if(isbn.equals(b.getISBN()))
      {
        return true;
      }
    }
    return false;
  }
  
  public boolean checkAvailabilityTitle(String title, ArrayList<Book> allBooks)
  {
    for(Book b: allBooks)
    {
      if(title.equals(b.getTitle()))
      {
        return true;
      }
    }
    return false;
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
