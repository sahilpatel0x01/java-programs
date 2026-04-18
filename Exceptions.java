public class Exceptions{
    public static void main(String []args) throws InvalidNumberException{
            // throw new InvalidNumberException();
            String [] boysHostel = {"rahul", "ramesh "," rajiv", "rajas", "ravindra", "ravan" , "ravina"};
            for(String name: boysHostel){
                System.out.println(name);
                if(name.equalsIgnoreCase("ravina")){
                    System.out.println("shift thr girl into girls hostel");
                    
                    throw new InvalidNumberException();
                    
                }
            }
            
            
    }
}

class InvalidNumberException extends Exception{
    @Override
    public String toString(){
        System.out.println("No females allowed"); 
        
        return "";
    }
}