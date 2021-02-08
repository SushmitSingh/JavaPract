import java.io.File;
//create Delete Rename
public class CDR{
public static void main(String... args) throws Exception {
File newFile=new File("MyNewFile.txt");
printFileDetails(newFile);
//Create a new File
boolean fileCreated=newFile.createNewFile();
if(!fileCreated){
System.out.println(newFile+"could not be created.");}
printFileDetails(newFile);
//Delete the new File
newFile.delete();
System.out.println("After deleting the new File");
printFileDetails(newFile);
//recreate the File
newFile.createNewFile();
printFileDetails(newFile);
//Let's tell the JVM to delete this file on exit
newFile.deleteOnExit();
System.out.println("After using deleteOnExit() method");
printFileDetails(newFile);
//Create a new File and rename it
File firstFile=new File("MyFirstFile.txt");
File secondFile=new File("MySecondFile.txt");
fileCreated=firstFile.createNewFile();
if(fileCreated || firstFile.exists()){
printFileDetails(firstFile);
printFileDetails(secondFile);
boolean renameFlag=firstFile.renameTo(secondFile);
if(!renameFlag){
System.out.println("Could not rename :"+firstFile);}
printFileDetails(firstFile);
printFileDetails(secondFile);}}
public static void printFileDetails(File f){
System.out.println("Absolute Path:"+f.getAbsoluteFile());
System.out.println("File exit :"+f.exists());}}