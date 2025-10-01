class Calculator{ // classe de calculatrice simple en java POO
  public void Calculator(){}
  public int add(int a, int b){
   int sum = a + b;
    return sum;
  }
  public int substract(int a,int b){
   int sub = a - b;
    return sub;
  }
  public int multiply(int a,int b){
  int mult = a * b;
    return mult;
  }
  public int divide(int a,int b){
   int div = a/b;
    return div;
  }
  public int modulo(int a, int b){
   int mod = a % b;
    return mod;
  }
  public static void main(String[] args){
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5,7));
    System.out.println(myCalculator.substract(45,11));
    System.out.println(myCalculator.(5,7));
  }
  

}