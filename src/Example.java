import java.util.Scanner;
class example2{
    public void check (){
        int a=1;
        int c=a+1;
        System.out.println(c);
    }


}

public class Example {
    public static void main(String [] args)    {
        System.out.println("Variables");
        Scanner sc=new Scanner(System.in);
        String username=sc.next();
        System.out.println("Hi....."+username);
        example2 ex2=new example2();
        ex2.check();

    }
}
