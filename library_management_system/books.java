package library_management_system;

import java.util.ArrayList;
import java.util.Arrays;

public class books {
      ArrayList<String> BookList = new ArrayList<>(
    Arrays.asList("game of thrones", "getting over it", "thanos: a mad titan"));
    //issuebook is called when the book is issued from cetral library so 
    // book is not available for the any other user until its get returned
    //   public void issueBook(String BookName){
    //     BookList.add(BookName);
    //     System.out.println("Book is issued: "+ BookName);
    //     }
    public void listBook (){
        System.out.println(BookList);
    }
    //addBook called when the user want to give the book to the central library
    //as a donation

    // public void addBook(String BookName){
      
    // }
    public void returnBook(String BookName){
          BookList.add(BookName);
        System.out.println("Book is added: "+ BookName);
    }
}
