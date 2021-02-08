import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
public class ZipFiles1{
public static void main(String... args){ try{
FileOutputStream fos=new FileOutputStream("Anand.zip");
ZipOutputStream zos=new ZipOutputStream(fos);
String fileName0="a.txt";
String fileName1="b.txt";
String fileName2="c.txt";
String fileName3="d.txt";
addToZipFile(fileName0,zos);
addToZipFile(fileName1,zos);
addToZipFile(fileName2,zos);
addToZipFile(fileName3,zos);
zos.close();
fos.close();}
catch(FileNotFoundException e){
e.printStackTrace();}
catch(IOException e){
e.printStackTrace();}}
public static void addToZipFile(String fileName,ZipOutputStream zos)throws FileNotFoundException,IOException{
System.out.println("Writing "+fileName+" to zip file");
//File file=new File(fileName);
FileInputStream fis=new FileInputStream(fileName);
//FileInputStream fis=new FileInputStream(file);
ZipEntry zipEntry=new ZipEntry(fileName);
zos.putNextEntry(zipEntry);
byte[] bytes=new byte[fis.available()];
fis.read(bytes);
zos.write(bytes);
zos.closeEntry();
fis.close();}}