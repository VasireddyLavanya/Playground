import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int arr_size=sc.nextInt();
      int a[]=new int[arr_size];
      for(int i=0;i<arr_size;i++)
        a[i]=sc.nextInt();
      int b=0;
      int n=arr_size;
      for(int i=0;i<=(arr_size)/2;i++){
           if(a[i]!=a[n-1])
           {
             b=1;
             break;
           }
        n--;
    }
      if(b==1)
          System.out.println("No");
      else
        System.out.println("Yes");
}}