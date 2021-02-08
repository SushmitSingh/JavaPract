import java.util.Scanner;
public class Tast1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number For Enter Values");
		int n = sc.nextInt();
		 int aman[];
		 aman = new int[n];
		
		 for(int i=0;i<=aman.length-1; i++)
		 {
			 System.out.println("Enter Number - "+ i);
			 aman[i]= sc.nextInt();
		 }
//		 for(int i=0;i<=aman.length-1; i++)
//		 {
//			 System.out.println(aman[i]);
//		 }
		 
		 String sum = sumArray(aman);
		 System.out.println(sum);
		 
		    int re= maxValue(aman);
		    System.out.println(re);
		 
	}

	
	static int maxValue(int pera[])
	{
		int sum=0;
		
		for(int mark:pera)
		 {
			sum=sum+mark;
		 }
		
		return sum;
		
	}
	
	private static String sumArray(int pera[]) {
		// TODO Auto-generated method stub
		int total=0;
		String Final="";
		String a="";       
		for(int i=0;i<=pera.length-1; i++)
			 {
				 total = total+pera[i];
				 a = a+"+"+pera[i];
			 }
		 Final = a +" Is Eqaul "+total;
		return Final;
	}
	
	
	
	
	

	
}
