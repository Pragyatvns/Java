import java.util.Scanner;

public class GCD
{
    static int gcd1(int a,int b){
        if(a>b)

            return(a-b);

        else
            return (b-a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the two no=");
        int m=sc.nextInt();
        int n= sc.nextInt();
        System.out.println(gcd1(m,n));

    }
}
