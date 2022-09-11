class SwapVal{
    int a,b;
    SwapVal()
    {
    }
    SwapVal(int i,int j)
    {
      a=i;
      b=j;
    }
    void swap(int a, int b)
    {
      System.out.println("Before Swapping: a =" +a+" and b = " +b);
      int c = a;
      a = b;
      b = c;
      System.out.println("After Swapping: a =" +a+" and b = " +b);
    }
    void swapref(SwapVal val)
    {
      System.out.println("Before swapping: a =" +a+" and b = " +b);
      int c;
      c=val.a;
      val.a=val.b;
      System.out.println("After swapping: a =" +val.a+ " and b = " +val.b);
    }
    public static void main(String[] args)
    {
      SwapVal sw1 = new SwapVal();
      sw1.swap(30,40);
      SwapVal sw2 = new SwapVal(7,8);
      sw2.swapref(sw2);
    }
}