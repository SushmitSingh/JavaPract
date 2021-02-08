import java.io.*;
class PrintErrAndPrintln{
public static void main(String... args)throws IOException{
FileOutputStream fout=new FileOutputStream("anand.txt");
PrintStream ps=new PrintStream(fout);
System.out.println("Hello");
System.setOut(ps);
System.out.println("Hay");
FileOutputStream fout1=new FileOutputStream("xyz.txt");
PrintStream ps1=new PrintStream(fout1);
System.setErr(ps1);
System.out.println("Hello");}}
/* 
final System;
public static PrintStream out;
final public static PrintStream err; */