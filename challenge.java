import  java.util.Scanner;
public class challenge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name=sc.nextLine();
        System.out.println("Enter Your Age:");
        int age=sc.nextInt();
        System.out.println("***YOur Info***\nName:"+name+"\nAge:"+age+"\n******_______******");

        if (age>=18) {
            System.out.println(name+":YOur Eligibel for vote");            
        }
        else{
            System.out.println(name+":YOur not Eligeblae for vote");
        }
    }
    
}
