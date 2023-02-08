import java.util.*;

public class Practise1
{
    public static void main(String[] args) {
        int A[]={1,4,5,3,5};
        int B[]={7,2,1,3,2};
        int C[]=new int[5];

        for(int i=0;i<A.length;i++)
        {
            if(A[i]>B[i])
            {
                C[i]=A[i]-B[i];
            }
            else {
                C[i]=B[i]-A[i];
            }

        }
        Arrays.sort(C);


        System.out.println(C[0]);


    }
}
