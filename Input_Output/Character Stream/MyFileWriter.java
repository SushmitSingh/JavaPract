import java.io.*;
class MyFileWriter{
public static void main(String... args) throws IOException{
FileWriter fw=new FileWriter("Anand.txt");
//FileWriter fw=new FileWriter("Anand.txt",true);
//FileWriter fw=new FileWriter(new File("e:/anand"),true);
String s="india is good country ";
char ch[]=s.toCharArray();
for(int i=0;i<ch.length;i++)
fw.write(ch[i]);// fw.write(ch) or fw.write(s)
fw.close();}}