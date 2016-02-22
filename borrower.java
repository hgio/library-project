import java.util.ArrayList;
public abstract class borrower{
  public abstract int getOsis();
  public abstract ArrayList<String> getBooksOut();
  public abstract String getOfficialClass();
  public abstract double getFines();
  public abstract int getGrade();
  public abstract void takeOutBook(Book a);
  public abstract void returnBook(Book b);
}
