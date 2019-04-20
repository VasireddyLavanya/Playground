import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      Scanner sc=new Scanner(System.in);
      String st1=sc.nextLine();
      String st2=sc.nextLine();
      String sr1=sc.nextLine();
      System.out.print(st1.replace(st2,sr1));
    }
}