import java.io.*;
class PrintWriterExample{
public static void main(String... args)throws IOException{
PrintWriter pw=new PrintWriter(new FileWriter("Anand.txt"));
pw.println("Hellow");
pw.println("Hay");
pw.close();
System.out.println("File Created");}}