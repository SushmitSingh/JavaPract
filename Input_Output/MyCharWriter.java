import java.io.*;
class MyCharWriter{
	public static void main(String args[]) throws IOException{
		CharArrayWriter fw=new CharArrayWriter();
		String s="Anand kumar bind";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
			fw.write(ch[i]);
		// fw.write(ch);
		fw.writeTo(new FileWriter("Temp.txt"));
		System.out.println(fw.toString());
		char z[]=fw.toCharArray();
		CharArrayReader fr=new CharArrayReader(z);
		int i=0;
		while((i=fr.read())!=-1)
System.out.print((char)i);}}