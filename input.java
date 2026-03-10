import java.util.Scanner;

public class input {
 public static void main(String[] args) {
  Scanner input=new Scanner(System.in);

  System.out.print("Enter your name:");
  String name=input.nextLine();
 
   System.out.print("Enter your age:");
  int age=input.nextInt();

  System.out.print("Enter Your GPA:");
  float cgpa=input.nextFloat();
  System.out.print("Are you Student?");
  boolean isStd=input.nextBoolean();
 
  System.out.println();

  System.out.println("Hello "+name);
  System.out.println("your age "+age+" year old");
  System.out.println("Your C.G.P.A:"+cgpa);
  System.out.println("Student:" + isStd);
  if (isStd) {
    System.out.println("Your Are Enrolled");
  }
  else{
    System.out.println("Your AreNot Enrolled");
  }
   input.close();
 }   
}
