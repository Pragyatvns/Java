public class SumOfArray
{
    public static void main(String[] args) {
        int A[]=new int[5];
        int sum=0;
        A[0]=5;
        A[1]=7;
        A[2]=4;
        A[3]=9;
        A[4]=8;
        for(int i=0;i<A.length;i++){
            sum=sum+A[i];
        }
        System.out.println(sum);
    }
}
