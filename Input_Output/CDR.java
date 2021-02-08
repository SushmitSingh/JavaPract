import java.io.*;
//create delete rename
public class CDR{
	public static void main(String...args) throws Exception{
		File newFile=new File("my_first_file.txt");
		printFileDetails(newFile);
		//create a new file
		boolean fileCreated=newFile.createNewFile();
		if(!fileCreated){
		System.out.println(newFile+"could not be created");}
		printFileDetails(newFile);
		//delete the new File
		newFile.delete();
		System.out.println("After deleting the new file");
		printFileDetails(newFile);
		// recreated the file
		newFile.createNewFile();
		printFileDetails(newFile);
		
newFile.createNewFile();
printFileDetails(newFile);
//let's tell the JVM to delete this file on exit
newFile.deleteOnExit();
System.out.println("After using deleteOnExit() method:");
printFileDetails(newFile);
// create a new file and rename it
File firstFile = new File("my_first_file.txt");
File secendFile=new File("my_second_file.txt");
fileCreated =firstFile.createNewFile();
if(fileCreated || firstFile.exists()){
	printFileDetails(firstFile);
	printFileDetails(secendFile);
	boolean renameFlag=firstFile.renameTo(secendFile);
	if(!renameFlag){
	System.out.println("Could Not rename"+firstFile);}
	printFileDetails(firstFile);
printFileDetails(secendFile);}}
public static void printFileDetails(File f){
	System.out.println("Absolute path:"+f.getAbsoluteFile());
System.out.println("File Exists:"+f.exists());}
}

/*
String s=f1.getPath();
String s=f1.getParent();
String s=f1.getName();
String s=f1.getSize();
String s=f1.isHidden();
String s=f1.delete();
String s=f1.list();

f1="Anand.txt";
f2="xyz";
f1.rename(f2);

File f=new File("c:\\Temp\\Aand.txt");
File f=new File("d:");
File f=new File("c:\\temp");


File f=new File("c:\\temp","anand.txt");

File f=new File(f,"anand.txt");

boolean b=f.exists();
boolean b=f.isFile();
boolean b=f.isDirectory();

*/