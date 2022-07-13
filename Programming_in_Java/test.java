class test{
  void area(long a ,long b){
    long c = a*b;
      System.out.println("Area of Rectangle"+ c);
  }
  void area(int a){
      System.out.println("Area of Square"+ a*a);
  }
  public static void main(String[] args) {
      Overloading obj = new Overloading();
      obj.area(10, 10);
      obj.area(10);
  }
}
