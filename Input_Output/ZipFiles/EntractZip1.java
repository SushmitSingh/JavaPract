import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
public class EntractZip1{
public static void main(String... args){
try{
ZipFile zipfile=new ZipFile("Anand.zip");
Enumeration enu=zipfile.entries();
while(enu.hasMoreElements()){
ZipEntry zipEntry=(ZipEntry) enu.nextElement();
String name=zipEntry.getName();
System.out.println("Name "+name);
InputStream is=zipfile.getInputStream(zipEntry);
//File file=new File("e:\\"name);
//FileOutputStream fos=new FileOutputStream(file);
FileOutputStream fos=new FileOutputStream(name);
int length;
while((length=is.read())!=-1){
fos.write(length);}
is.close();
fos.close();}
//zipFile.close();
}
catch(IOException e){
e.printStackTrace();}}}