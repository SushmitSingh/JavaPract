import java.io.*;
class MyFileReader{
public static void main(String... s)throws IOException {
//FileInputStream fr=new FileInputStream("Anand.txt");
FileInputStream fr=new FileInputStream(new File("D:\\f1\\Anand.txt"));
int i=0;
while((i=fr.read())!=-1)
System.out.print((char)i);
fr.close();}}


import java.io.*;
class MyFileReader1{
	public static void main(String [] args) throws IOException{
		FileReader fr=new FileReader("Anand.txt");
		int i=0;
		while((i=fr.read())!=-1)
			System.out.print((char)i);
fr.close();}}