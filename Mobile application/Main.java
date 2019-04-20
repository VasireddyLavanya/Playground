class M1 {
     void display()
     {
      System.out.println("Features of MyModel 1");

System.out.println("Camera mega pixels: 2");
     }
}
class M3 {
     //write your logic here
  void display()
  {
  System.out.println("Features of MyModel 2");

System.out.println("Camera mega pixels: 5");

System.out.println("Lock mechanism: Fingerprint");

System.out.println("Display size: 5");
  }
    
}
class M2{
     //write your logic here
void display()
{
System.out.println("Features of MyModel 2T");

System.out.println("Camera mega pixels: 16");

System.out.println("Lock mechanism: Fingerprint");

System.out.println("Display size: 6");
}
}
public class Main 
{
    public static void main(String[] args) 
    {
       M1 m1=new M1();
       m1.display();
       M3 m3=new M3();
       m3.display();
       M2 m2=new M2();
       m2.display();
    }
}