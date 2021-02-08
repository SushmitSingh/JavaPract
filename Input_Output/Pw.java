import java.io.*;
class Pw{
	public static void main(String []args) throws IOException{
		PrintWriter pw=new PrintWriter(new FileWriter("Anand.txt"));
		pw.println("HEllow");
		pw.println("anand");
		pw.close();
System.out.println("File Created");}}