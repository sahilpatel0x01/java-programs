package library_management_system;
import java.util.ArrayList;

import library_management_system.*;

public abstract class main {
    public static void main(String[] args) {
        //create array of students
        SetupStudents();
        // create a user 
        User sahil = new User();
        
        // user saved in registered Users 
        // books data stored in books.java 
        books DB1books = new books();
        // DB1books.bookSetup();
        sahil.setName("patel");
        sahil.getName();
        sahil.addBook();
        sahil.listBook();
        sahil.issueBook("how to become a tyrent");
        sahil.returnBook();
    }
    public static void SetupStudents(){
        ArrayList<String> RegisteredStudents = new ArrayList<>();
    }
}
