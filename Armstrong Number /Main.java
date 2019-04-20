import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int n1=n,n2=n;
      int r,c=0;
      int sum=0;
      while(n1>0)
      {
      
        n1=n1/10;
        c++;
      }
      while(n>0)
      {
        r=n%10;
        sum=sum+(r*r*r);
        n=n/10;
      }
      
      
      if(n2==sum)
      {
        System.out.println("Armstrong Number");
      }
      else 
        System.out.println("Not a Armstrong Number");
	}
}