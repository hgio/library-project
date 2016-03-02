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
  
  public static ArrayList<Teacher> makeTeachers(String filename){
    ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    
    try{
      FileReader a = new FileReader(filename);
      BufferedReader b = new BufferedReader(a);
    
      String rline = b.readLine();

      while(rline != null){
        String[] str = rline.split(",");
        
        teachers.add(new Teacher(Integer.parseInt(str[0].trim()),str[1]));
        rline = b.readLine();
      }
      b.close();
    }
    catch(FileNotFoundException er){
      System.out.print("No files here!");
    }
    catch(IOException er){
      System.out.print("There was a problem reading: \"" + filename + "\"");
    }
    return teachers;         
  }
  
  
}
