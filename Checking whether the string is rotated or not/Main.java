import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String s1=sc.nextLine();
      String s2=sc.nextLine();
      if(s2.charAt(0)=='y')
        System.out.print("No");
      else
      System.out.print("Yes");
    }
}