class Rectangle
{
  double length,breadth;

  Rectangle(double x)
  {
      length=x;
      breadth=x;
  }
  Rectangle(double a,double b)
  {
    length = a;
    breadth = b;
  }
  void getArea() 
  {
    double area = length*breadth;
    system.out.println("Area of Rectangle =" +area);
  }
  void getparameter()
  {
    double perimeter = 2*(length+breadth);
    system.out.println("Perimeter of Rectangle =" +perimeter);
  }
  public static void main(String[] args)
  {
    Rectangle r1 = new Rectangle(10);
    Rectangle r2 = new Rectangle(12.0);
    r1.getArea();
    r1.getparameter();
    r2.getArea();
    r2.getParameter();
  }
}