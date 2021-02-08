import java.util.Scanner;
public class ScannerCalculator{
	public static void main(String...ss){
		System.out.println("typr something like : 1+3");
		Scanner scanner=new Scanner(System.in);
		double n=Double.NaN;
		double n1=Double.NaN;
		String operation =null;
		try{
			n=scanner.nextDouble();
			operation=scanner.next();
			n1=scanner.nextDouble();
			double result=calu(n,n1,operation);
		System.out.printf("%s %s %s =%.2f%n",n,operation,n1 ,result);}
catch(Exception e){
	System.out.println("an invalid expression.");}}
	public static double calu(double op1,double op2, String operation){
		switch(operation){
			case"+":
			return op1+op2;
			case"-":
			return op1 -op2;
			case "*":
			return op1*op2;
			case"/":
		return op1/op2;}
return Double.NaN;}}
	
	