import java.io.*;
class MyByteWriter{
public static void main(String... s) throws IOException{
ByteArrayOutputStream fw=new ByteArrayOutputStream();
String ss="india is a good country";
byte ch[]=ss.getBytes();
for(int i=0;i<ch.length;i++)
fw.write(ch[i]);// fw.write(ch)
// fw.writeTo(OutputStream o);
fw.writeTo(new FileOutputStream("Anand.txt"));
fw.writeTo(new FileOutputStream("aanand.txt"));
System.out.println(fw.toString());
byte z[]=fw.toByteArray();
ByteArrayInputStream fr=new ByteArrayInputStream(z);
int i=0;
while((i=fr.read())!=-i)
System.out.println((char)i);}}