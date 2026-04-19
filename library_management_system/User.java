package library_management_system;
import java.util.ArrayList;
import java.util.Arrays;

public class User {
    
   //constants mutable
    String Name;
    ArrayList<String> RegisteredStudents = new ArrayList<>();
    ArrayList<String> MyBookList = new ArrayList<>(
    Arrays.asList("game of thrones", "getting over it", "thanos: a mad titan"));
    books db1 = new books();

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

   
    //addBook called when the user want to give the book to the central library
    //as a donation

    // public void addBook(String BookName){
      
    // }
    public void returnBook(String BookName){
          if(MyBookList.contains(BookName)){
                MyBookList.remove(BookName);
                 //code block that add the book into the cetral library{EMPTY}
                System.out.println("Book is returned: "+ BookName);
          }else{
            System.out.println("you never borrowed this book");
          }
         
        
       
    }
       public void issueBook(String BookName){
        MyBookList.add(BookName);
        System.out.println("Book is issued: "+ BookName);
        }

        public void listMyBook (){
        System.out.println(MyBookList);
        }
  
}
