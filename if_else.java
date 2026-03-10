import java.util.Scanner;

public class if_else{
    public static void main (String [] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int age=input.nextInt();
        if (age>=18) {
            System.out.println("Eligebale for vote");
        }
        else{
            System.out.println("NOt Eligebale for vote");
        }
    }
    
}
