import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
       for(int i=2;i<=n;i++)
       {
         int s=prime(i);
         if(s==1)
         
         
      System.out.println(i);
       }
	}
  public static int prime(int n)
  {
    int c=0;
    for(int i=2;i<=(n/2);i++)
    {
      if(n%i==0)
        c=c+1;
    }
      if(c==0)
        return 1;
   else
     return 0;
    
  }
  
}