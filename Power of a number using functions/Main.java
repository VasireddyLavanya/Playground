import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int b=sc.nextInt();
    int e=sc.nextInt();
    //for(int i=1;i<=n;i++)
      int s=power(b,e);
    System.out.println(s);
  }
  public static int power(int b,int e)
  {
    int s=1;
     for(int i=1;i<=e;i++)
      s=s*b;
    return s;
  }
  
}