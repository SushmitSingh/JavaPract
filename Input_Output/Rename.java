import java.io.File;
public class Rename{
	public static void main(String [] args){
		File oldFile=new File("CDR.class");
		File newFile=new File("new_dummy.class");
		boolean fileRanamed=oldFile.renameTo(newFile);
		if(fileRanamed){
		System.out.println(oldFile+ " renamed to " + newFile);}
		else{
System.out.println("Renaming " + oldFile + "  to " + newFile+ "   failed");}}}