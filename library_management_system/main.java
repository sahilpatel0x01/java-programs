package library_management_system;
import java.util.ArrayList;

public abstract class main {
    public static void main(String[] args) {
        //create array of students
        SetupStudents();
        // create a user 
        User sahil = new User();
        // user saved in registered Users 
        sahil.setName("Sahil Patel");
        
        sahil.getName();
        // sahil.addBook();
        sahil.listMyBook();
        sahil.issueBook("how to become a tyrent");
        sahil.listMyBook();
        sahil.returnBook("Game of thrones");
        sahil.listMyBook();
    }
    public static void SetupStudents(){
        ArrayList<String> RegisteredStudents = new ArrayList<>();
    }
}
