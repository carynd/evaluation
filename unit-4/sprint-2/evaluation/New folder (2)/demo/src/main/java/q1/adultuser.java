package q1;


public class adultuser implements library {
    private static int age;
    private static String booktype;
    public static void registerAccount(int age){



        if(age>12){
            System.out.println("You have successfully registered under an Adult Account");

        }
        else  System.out.println("Sorry, Age must be greater than 12 to register as an adult");

    }
    public static void requestBook(String booktype){

        if(booktype=="Fiction"){
            System.out.println("Book Issued successfully, please return the book within 7 days");

        }
        else  System.out.println("Oops, you are allowed to take only adult Fiction books");

    }
}
