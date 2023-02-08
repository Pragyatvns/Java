import java.util.Scanner;

public class DeleteElement
{
    public static void main(String[] args) {
        int A[]=new int[5];
        A[0]=1;
        A[1]=3;
        A[2]=6;
        A[3]=5;
        int n=4;
        for(int i=0;i<n;i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println(" ");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an index=");
        int index=sc.nextInt();
       for(int i=index;i<n;i++)
       {
           A[i-1]=A[i];
       }
       for(int i=0;i<n;i++)
       {
           System.out.print(A[i]+" ");
       }

    }
}
