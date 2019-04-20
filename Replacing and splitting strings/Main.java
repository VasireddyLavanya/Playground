import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      String str1=sc.nextLine();
     StringBuilder st=new StringBuilder(str);
      StringBuilder st1=new StringBuilder(str1);
       st=st1;
      String[] parts =str1.split(" ");
      for(String g:parts)
      System.out.println(g);
    }
}