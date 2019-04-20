import java.util.Scanner;
class Main
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    char ch=sc.next().charAt(0);
    int n=sc.nextInt();
    if(ch>='a'&&ch<='z')
    {
      ch=(char)(ch-n);
      if(ch<97)
          ch=(char)(ch+26);
    }
   if(ch>='A'&&ch<='Z')
    {
      ch=(char)(ch-n);
      if(ch<65)
          ch=(char)(ch+26);
    }
  System.out.println(ch);
}
  
}
