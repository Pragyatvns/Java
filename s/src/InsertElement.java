import java.util.Scanner;

public class InsertElement
{
    public static void main(String[] args) {
        int A[]=new int[7];
        A[0]=1;
        A[1]=4;
        A[2]=6;
        A[3]=8;
        A[4]=9;
        int n=5;
        for(int i=0;i<n;i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println(" ");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no to be inserted and index = ");
        int a=sc.nextInt();
        int index=sc.nextInt();
        for(int i=n;i>index;i--)
        {
            A[i]=A[i-1];
        }
        A[index]=a;
        n=n+1;
        for(int i=0;i<n;i++)
        {
            System.out.print(A[i]+" ");
        }
    }
}
