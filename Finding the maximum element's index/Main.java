import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    int l=0;
    int m=0;
    for(int j=0;j<n;j++)
    {
      if(l<a[j])
      {
        l=a[j];
        m=j;
      }
    }
    System.out.print(m);
  }
}
