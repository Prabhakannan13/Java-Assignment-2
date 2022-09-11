import java.util.*;
class mathFunction
{
float z;
void multiply(int x,int y)
{
  z=x*y;
  System.out.println("z="+z);
}
void multiply(float x, float y)
{
  z=x*y;
  System.out.println("z="+z);
}
void multiply(int x,float y)
{
  z=x*y;
  System.out.println("z="+z);
}
}
class mathFunctionD
{
  public static void main(String args[])
  {
     mathFunction f=new mathFunction();
     f.multiply(6,7);
     f.multiply((float)6.1,(float)8.2);
     f.multiply(4,(float)8.2);
  }
}