import java.io.*;
import java.util.ArrayList;

public class Book{
  String title = "";
  String genre = "";
  String author = "";
  String status = "";
  String ISBN = "";
  boolean available = true;  //POSSIBLY NOT IN USE
  public Book(String bISBN, String btitle, String bauthor, String bgenre, String bstatus){
      title = btitle;
      genre = bgenre;
      author = bauthor;
      status = bstatus;
      ISBN = bISBN;
    //  boolean available = bavailable;   NOT IN DOCUMENT, if it is, ADD TO PARAMETERS AGAIN
  }

  public String getTitle()
    {return title;}
  public String getGenre()
    {return genre;}
  public String getAuthor()
    {return author;}
  public String getStatus()
    {return status;}
  public String getISBN()
    {return ISBN;}
  public boolean getAvailability()
    {return available;}
  
  public ArrayList<Book> makeBooks(String filename){
    ArrayList<Book> books = new ArrayList<Book>();
    
    try{
      FileReader a = new FileReader(filename);
      BufferedReader b = new BufferedReader(a);
    
      String rline = b.readLine();
      

      while(rline != null){
 //       System.out.println(rline);
        String[] str = rline.split(",");
//        System.out.print(str.length);
 //       for(int i = 0;i < str.length; i++)
 //         System.out.print(i + "," + str[i] + " AAA ");   
        if(str.length >= 5){
          String v = str[0];
          String w = str[1];
          String x = str[2];
          String y = str[3];
          String z = str[4];
          books.add(new Book(v,w,x,y,z));}
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
    return books;                               
  }
  


  public String toString(){
    return ISBN + "," + title + "," + genre + "," + author + "," + status;
  }

  public void changeAvailability(){
    available = !available;
  }
}
