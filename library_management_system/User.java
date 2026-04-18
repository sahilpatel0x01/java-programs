package library_management_system;
import library_management_system.books;

import java.util.ArrayList;

public class User {
    
   //constants mutable
    String Name;
    ArrayList<String> RegisteredStudents = new ArrayList<>();
    books db1 = new books();
    db1.setup();

    public String getName(){
System.out.println("getName says "+ Name);
        return Name;
    }

    // setName();
     public String setName(String setName){
        Name = setName;
        RegisteredStudents.add (setName);
        System.out.println("name set successful "+ setName);
       return Name;
    }
    // issuedBooks();
    public void issueBook(String BookName){
        
    }
    public void listBook (){

    }
    public void addBook(){

    }
    public void returnBook(){
        
    }
}
