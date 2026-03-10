public class type_conversion {
    public static void main(String args[]){
        int num1=30;
        float fnum1=num1;// Correct
        System.out.println(fnum1);
        float fnum2=45.7f;
        int num2=(int)fnum2;// Correct//--------->//int num2=fnum2;<---- This is an error
        System.out.println(num2);
        double dnum=456.980;
        float fnum=(float)dnum;// Correct//--------->//float fnum=dnum2;<---- This is an error
        System.out.println(fnum);
    }
    
}
