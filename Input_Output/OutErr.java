import java.io.*;
class OutErr{
public static void main(String... s)throws IOException{
FileOutputStream fout=new FileOutputStream("abc.txt");
PrintStream ps=new PrintStream(fout);
System.out.println("Hello");
System.out.println(ps);//final System; public static PrintStrea out; final public static PrintStream err;
System.out.println("hey");
FileOutputStream fout1=new FileOutputStream("xyz.txt");
PrintStream ps1=new PrintStream(fout1);
System.setErr(ps1);
System.out.println("Hello");
}}