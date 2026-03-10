import java.util.Scanner;
public class if_else_if {
    public static void main(String[]Args)
{
     Scanner inp=new Scanner(System.in);
     System.out.println("Enter  num 1:");
     int n1=inp.nextInt();
     System.out.println("Enter  num 2:");
     int n2=inp.nextInt();
     System.out.println("Enter  num 3:");
     int n3=inp.nextInt();

     if (n1>n2 && n1>n3) 
        System.out.println(+n1+" is greater");
      else if (n2>n1 && n2>n3)
        System.out.println(+n2+" is greater");
     else
        System.out.println(+n3+" is greater");
     

}    
}
