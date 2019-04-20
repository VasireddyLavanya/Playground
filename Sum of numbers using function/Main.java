import java.util.Scanner;
class Main{
  public static int add(int a)
  {
    int c=0;
    for(int i=1;i<=a;i++)
    {
      c=c+i;
    }
    return c;
  }
	public static void main (String[] args){
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      
      int sum=add(n1);
      System.out.println(sum);
	  
	}
}