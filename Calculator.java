import java.util.*;
class Calculator
{
static double powInt(int num1,int num2)
{
return Math.pow(num1,num2);
}
static double powDouble(double num1,int num2)
{
return Math.pow(num1,num2);
}


public static void main(String args[])
{

System.out.println(Calculator.powInt(10,6));
System.out.println(Calculator.powDouble(5.0,10));
}
}