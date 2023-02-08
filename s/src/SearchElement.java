import java.util.Scanner;

public class SearchElement
{
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6,7,8};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the key= ");
        int key=sc.nextInt();
        for(int i=0;i<A.length;i++) {
            if (A[i] == key) {
                System.out.println(i);
                System.exit(0);
            }

        }

                System.out.println("not found");

    }
}
