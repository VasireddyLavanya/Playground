import java.util.Scanner;
class Main{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
  
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      int d1=sc.nextInt();
      int s2=sc.nextInt();
      int flag1=0;
      int flag2=0;
      for(int k=0;k<n;k++)
      {
         if(a[k]==d1)
         {
           flag1=1;
           System.out.println(k);
         }
      }
      if(flag1==0)
        System.out.println("-1");
      int j;
      for(j=0;j<n;j++)
      {
         if(a[j]==s2)
         {
           flag2=1;
           System.out.println(j);
         }
      }
      if(flag2==0)
        System.out.println("-1");
      
      
    }
}