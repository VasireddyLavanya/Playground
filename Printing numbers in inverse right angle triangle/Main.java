import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int n1=n;
      for(int i=0;i<n;i++)
      {
       
        for(int j=n1;j>0;j--)
        {
          System.out.print(j);
      }
        n1--;
        System.out.println();
}
    }}