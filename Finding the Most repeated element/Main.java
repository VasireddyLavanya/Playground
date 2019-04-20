import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
     int sum[]=new int[n];
    int sum1[]=new int[n];
    int k=0;
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    for(int i=0;i<n;i++)
    { 
      int c=0;
       for(int j=0;j<n;j++)
       {
          if(a[i]==a[j])
            c++;
       }
       sum[k]=c;
        sum1[k]=a[i];
      k++;
    }
    int t=0,min=0;
    for(int i=0;i<n;i++)
    {
       if(sum[i]>min)
       {
         t=i;
         min=sum[i];
       }
    }
    System.out.println(sum1[t]);
  }
}