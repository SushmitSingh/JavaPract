import java.io.BufferedInputStream;
import java.io.FileInputStream;
public class BufferedStream{
public static void main(String... s){
String srcFile="lalu.txt";
try{
BufferedInputStream bis=new BufferedInputStream(new FileInputStream(srcFile))}
//read on byte at a from an disp it 
byte byteData;
while((byteData=(byte)bis.read()!=-1){
System.out.println((char)byteDate);}}
catch(Exception e){
e.printStackTrace();}}}