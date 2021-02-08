import java.io.*;
class MyFileWriter{
public static void main(String... s)throws IOException {
\\FileInputStream fr=new FileInputStream("Anand.txt");
FileInputStream fe=new FileInputStream(new File("D:\\f1\\Anand.txt");
int i=0;
while((i=fr.read())!=-1)
System.out.print((char)i);
fr.close();}}


import java.io.*;
class MyFileWriter{
	public static void main(String... ss) throws IOException {
		FileWriter fw=new FileWriter("Anand.txt");
		//FileWriter fw=new FileWriter("Anand.txt",tru);
		//FileWriter fw=new FileWriter(new File("e:\\f1\\Anand.txt"),true);
		String  s="@@NAME##@@NAME##";
		char ch[]=s.toCharArray();
		for(int i=100*100;i<=100*100;i++){


		for(int i=0;i<ch.length;i++)
			fw.write(ch[i]);
		// fw.write(ch)
		//fw.write(s);
fw.close();
}

}}
		