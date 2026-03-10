import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner inpt=new Scanner(System.in);
        int marks[]=new int[5];
        marks[0]=inpt.nextInt();
        marks[1]=inpt.nextInt();
        marks[2]=inpt.nextInt();
        marks[3]=inpt.nextInt();
        marks[4]=inpt.nextInt();
      System.out.println("Marks have been entered");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
            
        }
        
    }
    
}
