import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       // int l=sc.nextInt();
        //int b=sc.nextInt();
      //int h=sc.nextInt();
      int n1=sc.nextInt();
      switch(n1)
      {
        case 1:
           int l=sc.nextInt();
      //  int b=sc.nextInt();
    //  int h=sc.nextInt();
          System.out.println(l*l);
          break;
          case 2:
           int l2=sc.nextInt();
        int b=sc.nextInt();
      //int h=sc.nextInt();
          System.out.println(l2*b);
          break;
          case 3:
           //int l=sc.nextInt();
        int b1=sc.nextInt();
      int h=sc.nextInt();
          System.out.println(0.5*b1*h);
          break;
         case 4:
           int l1=sc.nextInt();
        //int b=sc.nextInt();
      //int h=sc.nextInt();
          System.out.println(3.14*l1*l1);
          break;
      }
    }
}