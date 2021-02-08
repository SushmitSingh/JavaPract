import java.io.*;
class Ps1{
public static void main(String... s) throws IOException{
FileOutputStream fout=new FileOutputStream("pss.txt");
PrintStream ps=new PrintStream(fout);
ps.println("helloe");
ps.println("hay");
System.out.println("File is Created");}}