import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      int k=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
         a[i]=sc.nextInt();
      for(int i=1;i<=k;i++){
         int n1=0;
        for(int j=0;j<n;j++)
          if(i==a[j])
            n1++;
       System.out.println(i+" "+n1);
    }
}}