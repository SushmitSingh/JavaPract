
import java.io.*;
class BStream{
	public static void main(String...s){
		String srcFile="Anand.txt";
		try(BufferedInputStream bin=new BufferedInputStream(new FileInputStream(srcFile))){
			//Read one byte at a time and display it
			byte byteData;
			while((byteData=(byte) bin.read())!=-1){
		System.out.print((char)byteData);}}
		catch(Exception e2){
e2.printStackTrace();}}}