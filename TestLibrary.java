import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
public class TestLibrary{
  public static void main(String[] args){
    ArrayList<Book> books=new ArrayList();
    ArrayList<Borrower> borrowers=new ArrayList();
    //Here we will create a list of books from the .txt file
    int a;
    int b=0;
    int c=-1;
    int d=-1;
    int id=-1;
    int e=-1;
    int f=-1;
    String checkOut;
    int checkOut1;
    char person;
    book temp;
    boolean check;
    Scanner kb=new Scanner(System.in);
    while (true){
      System.out.print("Please enter the letter S if you are a student, T if you are a teacher, and L if you are a librarian");
      person=(char) kb.nextLine();
      if(person=='S' || person=='T' || person =='L'){
        break;
      }
      System.out.println("That is an invalid character, please try again");
    }
    if(person=='S'|| person=='T'){
    if(person=='S'){
      //here we will set borrower to a list of all the students in the  txt file;
      while(true){
      System.out.println("Please enter your OSIS");
      id=kb.nextInt();
      for(int i=0; i<borrowers.size(); i++){
        if(borrowers.get(i).getOSIS==id){
          a=i;
          break;
        }
      }
        System.out.println("That was not a valid OSIS. Please try again");
      }
    }
    if(person=='T'){
      //Here we will set borrower to a list of all the teachers in the .txt file;
      while(check==true){
      System.out.println("Please enter your ID");
      id=kb.nextInt();
      for(int i=0; i<borrowers.size(); i++){
        if(borrowers.get(i).getID==id){
          a=i;
          break;
        }
      }
        System.out.println("That was not a valid OSIS. Please try again");
      }
    }
    while(check==true){
      while(true==true){
      System.out.print("Welcome to the library! If you would like to browse books, enter 1, if you would like to check a book's availability, enter 2, if you would  like to check out a book, enter 3, if you would like to return a book, enter 4");
      b=kb.nextInt();
        if(b>0 && b<5){
          break;
        }
        System.out.println("That is not a valid selection. Please try again.");
      }
      if(b==1){
        System.out.print("Please enter the category you would like to see");
        String category=kb.nextLine();
        for(int i=0; i<books.size(); i++){
          if(books.get(i).getGenre().equals(category)){
            System.out.println(books.get(i).getGenre());
          }
        }
      }
      if(b==2){
        while(check==true){
        System.out.println("Are you checking the book by name or ISBN number? enter 1 for name, 2 for ISBN number");
        d= kb.nextInt();
        if(d>0 && d<3){
          break;
        }
        System.out.println("That entry was invalid. Please try again.");
        }
        if(d==1){
        System.out.print("Please enter the book you would like to check out");
        checkOut=kb.nextLine();
        Book temp1;
        for(int i=0; i<books.size(); i++){
          if(books.get(i).getTitle().equals(checkOut)){
            temp1=books.get(i);
          }
        }
        if(temp1==null){
          System.out.println("That is not a valid book. Sorry");
        }
        else{
          if(temp.getAvailability()==True){
          System.out.println("That book is available");
          }else{
            System.out.println("That book is not available");
        }
        }
        }else{
          System.out.print("Please enter the ISBN of the book you would like to check out");
        checkOut1=kb.nextInt();
        Book temp2;
        for(int i=0; i<books.size(); i++){
          if(books.get(i).getISBN().equals(checkOut)){
            temp2=books.get(i);
          }
        }
        if(temp2==null){
          System.out.println("That is not a valid book. Sorry");
        }
        else{
           if(temp.getAvailability()==true){
          System.out.println("That book is available");
          }else{
            System.out.println("That book is not available");
        }
        }
        }
      }
      if(b==3){
        d=-1;
        while(check==true){
        System.out.println("Are you checking the book by name or ISBN number? enter 1 for name, 2 for ISBN number");
        d= kb.nextInt();
        if(d>0 && d<3){
          break;
        }
        System.out.println("That entry was invalid. Please try again.");
        }
        if(d==1){
        System.out.print("Please enter the book you would like to check out");
        checkOut=kb.nextLine();
        for(int i=0; i<books.size(); i++){
          if(books.get(i).getTitle().equals(checkOut)){
            e=i;
          }
        }
        if(e<0){
          System.out.println("That is not a valid book. Sorry");
        }
        else{
          if(temp.getAvailability()==true&& ((d=='S' && borrowers.get(a).getBooksOut()<2) || (d=='T' && borrowers.get(a).getBooksOut()<4))){
            System.out.println("That book is now yours! Enjoy.");
            borrowers.get(a).addBookOut();
            books.get(e).changeAvailability();
          }
          else{
            System.out.println("That book is either not available or you have too many books out.");
        }
        }
        }else{
          System.out.print("Please enter the ISBN of the book you would like to check out");
        checkOut1=kb.nextInt();
        for(int i=0; i<books.size(); i++){
          if(books.get(i).getISBN().equals(checkOut1)){
            e=i;
          }
        }
        if(e<0){
          System.out.println("That is not a valid book. Sorry");
        }
        else{
           if(temp.getAvailability()==true&& ((d=='S' && borrowers.get(a).getBooksOut()<2) || (d=='T' && borrowers.get(a).getBooksOut()<4))){
            System.out.println("That book is now yours! Enjoy.");
            borrowers.get(a).addBookOut();
            books.get(e).changeAvailability();
          }
          else{
            System.out.println("That book is either not available or you have too many books out.");
        }
      }
      }
      if(b==4){
        d=-1;
        while(check==true){
        System.out.println("Are you checking the book by name or ISBN number? enter 1 for name, 2 for ISBN number");
        d= kb.nextInt();
        if(d>0 && d<3){
          break;
        }
        System.out.println("That entry was invalid. Please try again.");
        }
        if(d==1){
        System.out.print("Please enter the book you would like to check out");
        checkOut=kb.nextLine();
        for(int i=0; i<books.size(); i++){
          if(books.get(i).getTitle().equals(checkOut)){
            e=i;
          }
        }
        if(e<0){
          System.out.println("That is not a valid book. Sorry");
        }
        }
        else{   
          System.out.print("Please enter the ISBN of the book you would like to check out");
        checkOut1=kb.nextInt();
        for(int i=0; i<books.size(); i++){
          if(books.get(i).getISBN().equals(checkOut1)){
            e=i;
          }
        }
        }
        if(e<0){
          System.out.println("That is not a valid book. Sorry");
        }
        else{
          System.out.println("You have succesfully returned that book.");
          books.get(e).changeAvailability();
          borrowers.get(a).removeBookOut();
        }
        }
      while(check==true){
        System.out.print("Would you like to do more in the library? Enter 1 for yes, 2 for  no");
        e= kb.nextInt();
        if(e<0 || e>2){
          System.out.println("That entry was invalid. Please try again");
        }else{
          break;
        }
      }
      if(e==2){
        break;
      }
    }
    }
    }else{
      while(check=true){
      while(check==true){
      System.out.print("Welcome to the library! If you would like to add a book, enter 1, if you would  like to remove a book, enter 2, if you would like to check a books availability, enter 3.");
      b=kb.nextInt();
        if(b>0 && b<4){
          break;
        }
        System.out.println("That is not a valid selection. Please try again.");
      }
      if(b==1){
        System.out.println("Please enter the name of the book");
        String a1=kb.nextLine();
         System.out.println("Please enter the genre of the book");
        String b1=kb.nextLine();
         System.out.println("Please enter the author of the book");
        String c1=kb.nextLine();
         System.out.println("Please enter the status of the book");
        String d1=kb.nextLine();
         System.out.println("Please enter the ISBN of the book");
        int e1=kb.nextInt();
        boolean f1=true;
        temp=book(a1,b1,c1,d1,e1,f1);
      }
      if(b==2){
        d=-1;
        while(check==true){
        System.out.println("Are you checking the book by name or ISBN number? enter 1 for name, 2 for ISBN number");
        d= kb.nextInt();
        if(d>0 && d<3){
          break;
        }
        System.out.println("That entry was invalid. Please try again.");
        }
        if(d==1){
        System.out.print("Please enter the book you would like to check out");
        checkOut=kb.nextLine();
        for(int i=0; i<books.size(); i++){
          if(books.get(i).getTitle().equals(checkOut)){
            e=i;
          }
        }
        }
        else{
          System.out.print("Please enter the ISBN of the book you would like to check out");
        checkOut1=kb.nextInt();
        for(int i=0; i<books.size(); i++){
          if(books.get(i).getISBN().equals(checkOut1)){
            e=i;
          }
        }
        }
        if(e<0){
          System.out.println("That is not a valid book. Sorry");
        }
        else{
          System.out.println("You have removed that book.");
          books.remove(e);
        }
      }
      else{
        d=-1;
        while(check==true){
        System.out.println("Are you checking the book by name or ISBN number? enter 1 for name, 2 for ISBN number");
        d= kb.nextInt();
        if(d>0 && d<3){
          break;
        }
        System.out.println("That entry was invalid. Please try again.");
        }
        if(d==1){
        System.out.print("Please enter the book you would like to check out");
        checkOut=kb.nextLine();
        for(int i=0; i<books.size(); i++){
          if(books.get(i).getTitle().equals(checkOut)){
            e=i;
          }
        }
        }
        else{
          System.out.print("Please enter the ISBN of the book you would like to check out");
        checkOut1=kb.nextInt();
        for(int i=0; i<books.size(); i++){
          if(books.get(i).getISBN().equals(checkOut1)){
            e=i;
          }
        }
        }
        if(e<0){
          System.out.println("That is not a valid book. Sorry");
        }
        else{
          if(books.get(e).getAvailability==true){
          System.out.println("That book is available");
          }else{
            System.out.println("That book is not available");
          }
        }
      }
      while(check==true){
      System.out.println("Would you like to do more in the library? Enter 1 for yes, 2 for no.");
      f=kb.nextInt();
      if(f>0 && f<3){
        break;
      }
      System.out.println("That is not a valid entry. please try again.");
      }
      if(f==2){
        break;
      }
      }
    }
    System.out.println("Thank you for visiting the library. Please come again soon!");
    if(person=='T'){
      PrintWriter end= new PrintWriter(Teachers.txt);
      for(int i=0; i<borrowers.size; i++){
        end.print(borrowers.get(i).getID() + "," + borrowers.get(i).getName());
      }
      end.close();
    }
    if(person=='S'){
      PrintWriter end= new PrintWriter(Students.txt);
      for(int i=0; i<borrowers.size; i++){
        end.print(borrowers.get(i).getOSIS() + "," + borrowers.get(i).getLastName() + "," + borrowers.get(i).getFirstName() + "," + borrowers.get(i).getGrade() + "," + borrowers.get(i).getOfficialClass() + ",") ;
      }
      end.close();
    }
    PrintWriter endb= new PrintWriter(Books.txt);
      for(int i=0; i<books.size; i++){
        endb.print(books.get(i).getTitle() + "," + books.get(i).getGenre() + "," + books.get(i).getAuthor() + "," + books.get(i).getstatus() + "," + books.get(i).getISBN() + "," + books.get(i).getAvailability() + ",") ;
      }
      endb.close();
  
}
}
    
      
      
        
    
          