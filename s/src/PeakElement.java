public class PeakElement
{
    public static void main(String[] args) {
        int A[]={5,2,7,9,4};
        int B[]=new int[5];
          for(int x:A)
          {
              System.out.print(x+" ");
          }
        System.out.println(" ");
          int j=B.length;
          for(int i=0;i<A.length;i++){
              B[j-1]=A[i];
                   j=j-1;
          }
          for(int x:B){
              System.out.print(x+" ");
          }

    }
}
