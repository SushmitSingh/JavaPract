import java.io.*;
class DataStream0{
public static void main(String... args)throws IOException{
FileOutputStream fout=new FileOutputStream("anand.txt");
DataOutputStream dout=new DataOutputStream(fout);
dout.writeInt(10);
dout.writeLong(121);
dout.writeBoolean(true);
dout.writeDouble(10.2);
dout.close();
FileInputStream fin=new FileInputStream("anand.txt");
DataInputStream din=new DataInputStream(fin);
int i=din.readInt();
long l=din.readLong();
boolean b=din.readBoolean();
double d=din.readDouble();
System.out.println(i);
System.out.println(l);
System.out.println(b);
System.out.println(d);}}