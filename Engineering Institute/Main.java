//import required packages
import java.util.*;
class Faculty
{
  public void salary(int n)
  {
    System.out.println("Base Salary: "+n);
  }
}
class CSE extends Faculty
{
  public void salary(int n)
  {
    System.out.println("CSE Faculty: "+(n+3000));
  }
}
class IT
{
  public void salary(int n)
  {
    //write your IT class statements
    System.out.println("IT Faculty: "+(n+5000));
  }
}
class ECE
{
  public void salary(int n)
  {
    //write your ECE class statements
    System.out.println("ECE Faculty: "+(n+4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Faculty f=new Faculty();
    f.salary(n);
    CSE s=new CSE();
    s.salary(n);
    IT i=new IT();
    i.salary(n);
    
    ECE obj = new ECE();
    obj.salary(n);
    //implement your required concept here
  }
}