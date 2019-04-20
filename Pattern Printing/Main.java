import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int i1=sc.nextInt();
      int j1=sc.nextInt();
      int n=i1;
      for(int i=0;i<n;i++){
       i1=n;
        for(int j=0;j<n;j++)
        {
           if(j>=i)
             System.out.print(n-i);
          else {
            System.out.print(i1);
            i1--;
          }
        }
        
        System.out.println();}
    }
}