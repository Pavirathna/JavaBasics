import java.util.Scanner;

public class example3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Ur Name :");
        String name=sc.next();
        int age=sc.nextInt();
        add(name,age);

    }
    public static void add(String name,int age)
    {
        System.out.println(name +age);
    }
}
