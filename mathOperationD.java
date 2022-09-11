import java.util.*;
class mathOperation
{
  double t;
  int x,y;
  mathOperation(){
  }
  void inir()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the x value");
    x=sc.nextInt();
    System.out.println("Enter the y value");
    y=sc.nextInt();
    }
  void add()
  {
    int r=x+y;
    System.out.println("The Added value is "+r);
  }
  void multiply()
  {
    int r=x*y;
    System.out.println("The multiplied value is "+r);
  }
  void power()
  {
    double r=Math.pow(x,y);
    System.out.println("R="+r);
  }
  void display()
  {
    add();
    multiply();
    power();
  }
}
class mathOperationD
{
  public static void main(String args[])
  {
    mathOperation m=new mathOperation();
    m.init();
    m.display();
  }
}
