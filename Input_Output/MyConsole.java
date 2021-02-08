import java.io.*;
class MyConsole{
	public static void main(String... args) throws IOException{
		Console cs=System.console();
		if(cs!=null)
			System.out.println("console is avaiable");
		System.out.println("Enter the line");
		String s1=cs.readLine();
		System.out.println(s1);
		String  s2=cs.readLine("Enter the name(%d chars):",5);
		System.out.println(s2);
		System.out.println("Enter the Password");
		char ch[]=cs.readPassword();
		char ch1[]=cs.readPassword("Enter the Password(%d chars):",5);
		System.out.println(new String(ch));
		System.out.println(new String(ch1));
		Reader r=cs.reader();
		int x=r.read();
		System.out.println(x);
		PrintWriter pw=cs.writer();
pw.println("Console via printWriter");}}