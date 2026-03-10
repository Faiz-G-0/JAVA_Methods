import java.util.Scanner;
public class for_loop {
    Scanner inpt=new Scanner(System.in);
    public static void main(String[] args) {

        Scanner inpt=new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int n=inpt.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("\n");
        for(int j=1;j<=10;j++)
        {
            
            System.out.println(i+"*"+j+"="+i*j);
            
        }
           
         }

        inpt.close();

    }
    
}
