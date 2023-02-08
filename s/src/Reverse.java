import java.util.Scanner;

public class Reverse
{
    public static void main(String[] args) {
        char c;
        String s="";

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string to be reversed= ");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
          c=str.charAt(i);
          s=c+s;

        }
        System.out.println("reversed="+s);
    }
}
