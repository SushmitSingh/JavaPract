import java.io.*;
class MyBufferedReader{
public static void main(String... args)throws IOException{
FileReader fr=new FileReader("Anand.txt");
BufferedReader br=new BufferedReader(fr);
String s=" ";
while(s!=null){
s=br.readLine();
if(s!=null)
System.out.println(s);}}}