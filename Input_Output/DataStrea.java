import java.io.*;
class DataStream{
public static void main(String... ss)throws IOException{
DataInputStream din=new DataInputStream(System.in);
FileOutputStream fout=new FileOutputStream("Anand.txt");
DataOutputStream dout=new DataOutputStream(fout);
String s="  ";
while(!s.equals("stop")){
s=din.readLine();
System.out.println(s);
dout.writeChars(s);
// dout..writeUTF(s); // dout.writeBtye(s);// writeChars(s);
dout.flush();}
din.close();
dout.close();}}