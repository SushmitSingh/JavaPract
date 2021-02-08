import java.io.*;
class DataRead{
public static void main(String... s)throws IOException{
DataInputStream din=new DataInputStream(new FileInputStream("Anand.txt"));
String ss="   ";
while(ss!=null){
ss=din.readLine();
if(s!=null)
System.out.println(s);}
din.close();}}