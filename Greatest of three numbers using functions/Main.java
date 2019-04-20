import java.util.Scanner;
class Main{
  public static int greatest(int a,int b,int c)
  {
     if(a>b){
       if(a>c)
         return a;
      else
        return c;
     }
    else{
      if(b>c)
        return b;
    else
      return c;
    }
  }
	public static void main (String[] args){
	 Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int c1=greatest(a,b,c);
      System.out.println(c1);
	}
}