import java.io.*;
class MyFileReader1{
public static void main(String... s)throws IOException {
FileInputStream fr=new FileInputStream("Anand.txt");
//FileInputStream fr=new FileInputStream(new File("D:\\f1\\Anand.jpg"));
byte b[]=new byte[fr.available()];
fr.read(b);
String ss=new String(b);
System.out.print(ss);}}
