import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int s1=0,s2=0,s3=0;
    for(int i=0;i<n;i++)
    {
      if(i<3)
        s1=s1+a[i];
      else if((i>=3)&&(i<6))
       s2=s2+a[i];
      else
        s3=s3+a[i];
    }
    if((s1==s2)&&(s3==s2))
       System.out.print("Perfect Batch");
    else
      System.out.print("Not a Perfect Batch");
      
  }
}