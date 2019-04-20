import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
          a[i]=sc.nextInt();
      int n1=1;
     int b=0;
      for(;n1<=n;n1++){
      for(int i=0;i<n;i++){
        if(n1==a[i])
         break;
        if(n1!=a[i]&&i==n-1)
        b=1;
      }
        if(b==1)
          break;
      
      }
    System.out.println(n1);
}}