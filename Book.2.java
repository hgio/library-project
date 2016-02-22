import java.io.*;
import java.util.ArrayList;

public class Book{
  String title = "";
  String genre = "";
  String author = "";
  String status = "";
  int ISBN = 0;
  boolean available = true;  //POSSIBLY NOT IN USE
  public Book(int bISBN, String btitle, String bauthor, String bgenre, String bstatus){
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
  public int getISBN()
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
        String[] str = rline.split(",");
       // for(int i = 0;i < str.length; i++)
        //  System.out.println(str[i]);
        
        books.add(new Book(Integer.parseInt(str[0].trim()),str[1],str[2],str[3],str[4]));
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
  
/*  public void removeBook(){
    FileReader a = new FileReader("Books.txt"); //For finding line to be removed
    BufferedReader b = new BufferedReader(a);
    File l = new File("Books.txt"); //File to be written
    FileReader c = new FileReader("Books.txt"); //For copying to new file
    BufferedReader d = new BufferedReader(c);
    FileWriter e = new FileWriter(l); //For writing to the new file
    BufferedWriter f = new BufferedWriter(e);
    
    String line = b.readLine();
    String linetotake = "";
    while(line != null)
      //Make sure the Book is found
      if(line.substring(0,line.indexOf(",")).equals("" + ISBN))
         linetotake = line;                                                                                         /// REMOVE UNTIL REQUIRED ///
    String nline = d.readLine();
    while (nline != null){
      if(!nline.substring(0,line.indexOf(",")).equals(linetotake.substring(0,line.indexOf(","))))
         f.write(nline); 
     //Delete old file here
    }
    
  }*/
  public void addBook(){
    
  }
  public String toString(){
    return ISBN + " " + title + " " + genre + " " + author + " " + status;
  }
  //public String checkHistory(){ //Returns the history of a book
  //}
  public void changeAvailability(){
    available = !available;
  }
}