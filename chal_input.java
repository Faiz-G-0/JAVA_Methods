import java.util.Scanner;

public class chal_input {
    public static void main(String args[])
    {
        float width;
        float hieght;
        float area;

        Scanner input=new Scanner(System.in);

      System.out.print("Enter Widht:");
      width=input.nextFloat();

      System.out.print("Enter Height:");
      hieght=input.nextFloat();
      
      area=(hieght*width);
      System.out.println("Area is "+area+"cm²");
      input.close();
       

    }
    
}
