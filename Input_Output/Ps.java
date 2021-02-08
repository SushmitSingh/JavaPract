import java.io.*;
class Ps{
public static void main(String...s)throws IOException {
FileOutputStream fout=new FileOutputStream("Chachii.txt");
PrintStream ps=new PrintStream(fout);
FileOutputStream fout1=new FileOutputStream("Chacha.txt");
PrintStream ps1=new PrintStream(fout1);
System.out.println("Before");
PrintStream ps4=System.out;
System.setOut(ps);
System.setErr(ps1);
System.out.println("chachii 240");
System.out.println("chachii 840");
System.err.println("chacha  420");
System.err.println("chacha 840");
// System.out=ps4;
System.setOut(ps1);
System.out.println("chacha 420");
System.setOut(ps4);
ps4.println("After");
System.out.println("Via Actual Out");}}