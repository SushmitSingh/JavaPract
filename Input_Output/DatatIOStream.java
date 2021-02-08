import java.io.*;
class a{
public static void main(String... s){
FileOutputStream fout=new FileOutputStream("Anand.txt");
DataOutputStream dout=new DataOutputStream(fout);
dout.writeInt(10);
dout.writeLong(101);
fout.writeDouble(10.1);
dout.close();
FileInputStream fin=new FileInputStream("Anand.txt");
DataInputStream din=new DataInputStream(fin);
int i=din.readInt();
long l=din.readLong();
boolean b=din.readBoolean();
double d=din.readDouble();
System.out.println(i);
System.out.println(l);
System.out.println(b);
System.out.println(d);}}