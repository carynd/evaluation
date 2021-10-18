package q1;

public class kiduser implements library{

    private static int age;
    private static String booktype;
    public static void registerAccount(int age){




        if(age<12){
            System.out.println("You have successfully registered under an kid Account");

        }
        else  System.out.println("Sorry, Age must be less than 12 to register as an adult");

    }
    public static void requestBook(String booktype){

        if(booktype=="Kids"){
            System.out.println("Book Issued successfully, please return the book within 10 days");

        }
        else  System.out.println("Oops, you are allowed to take only adult Kids books");

    }
}
