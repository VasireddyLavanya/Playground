import java.util.Scanner;
class Main
{
  public static int square(int n)
  {
    
    int q=n*n;
    return q;
  
  
  }
	public static void main (String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
	  int w=square(n1);
System.out.println(w);
    } 
}