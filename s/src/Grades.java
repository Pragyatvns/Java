import java.util.Scanner;

public class Grades
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the three subjects marks= ");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        int total=m1+m2+m3;
        System.out.println(total);
        float avg=total/3;
        System.out.println(avg);
    }
}
