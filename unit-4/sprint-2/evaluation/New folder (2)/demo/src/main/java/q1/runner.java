package q1;

public class runner {
    public static void main(String[] args) {
        adultuser ad = new adultuser();
        ad.registerAccount(22);
        ad.requestBook("Kids");

        kiduser kid = new kiduser();
        kid.registerAccount(5);
        kid.requestBook("Kids");
    }

}
