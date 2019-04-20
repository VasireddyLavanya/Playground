import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
      int n1=n;
      int p=1,sum=0,i,r;
          while(n1>0){
           r=n1%10;
            p=1;
           for(i=1;i<=r;i++)
           {
             
             p=p*i;
           }
            sum=sum+p;
          n1=n1/10;
          }
     if(sum==n)
       System.out.println("Yes");
      else
        System.out.println("No");
	}
}