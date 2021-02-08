import java.io.*;
class MyFileWtiter{
public static void main(String... ss) throws IOException {
// FileOutputStream fw=new FileOutputStream("Anand.txt");// WriteMode
//FileOutputStream fw=new FileOutputStream("Anand.txt",true);// AppendMode
FileOutputStream fw=new FileOutputStream(new File("d:\\f1\\Anand.txt"));
// FileOutputStream fw=new FileOutputStream(new File("d:\\f1\\Anand.txt",true));
String s="anand kumar bind from ghazipur up 233232";
byte ch[]=s.getBytes();
// fw.write(ch);
for(int i=0;i<ch.length;i++)
fw.write(ch[i]);
fw.close();
System.out.println("File created Successful");}}