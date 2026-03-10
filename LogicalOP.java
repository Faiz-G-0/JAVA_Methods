public class LogicalOP {
 
    public static void main(String [] args)
    {
       int n1=20;
       int n2=30;
       int n3=40;
       int n4=50;
       boolean r=n1<n2 && n2<n1 || n3<n4;
       System.out.println(r);
       System.out.println(!r);
    }
}
