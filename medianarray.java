import java.util.Scanner;

public class medianarray {
    public static void amin(String[] arsg)
    {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int [] A=new int[k];
        int m=A.length
        for(int i=0;i<m;i++)
        {
            A[i]=sc.nextInt();
        }
        int l=sc.nextInt();
        int [] B=new int[l];
        int n=B.length
        for(int j=0;j<n;j++)
        {
            B[j]=sc.nextInt();
        }
        if((m+n)%2!=0)
        {
            return(double)find(A,B,(m+n)/2,0,m-1,0,n-1);
            }
        else
        {
            return(find(A,B,m+n/2,0,m-1,0,n-1)+find(A,B,(m+n)/2-1,0,m-1,0,n-1));

        }
        public static int find(int {]A,int []B,int q,)
    }
}
