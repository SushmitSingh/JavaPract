/* Content Type of a File
Files.probeContentType(Path path) method probes the content type of a file.
The method returns the content type in the String form of String If the content type of a file cannot be determined, it returns value of a Multipurpose Internet Main Extension (MIME) content type null.*/

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
public class ContentTypeEx{
public static void main(String... args){
Path p=Paths.get("E:\\Anannd\\Bind\\Anand.txt");
//Path p=Paths.get("E:\\Anannd\\Bind\\Anand.doc");
//Path p=Paths.get("E:\\Anannd\\Bind\\Anand.pdf");
//Path p=Paths.get("E:\\Anannd\\Bind\\Anand.html");
try{
String contentType=Files.probeContentType(p);
System.out.format("Content type of %d is %s%n",p,contentType);}
catch(IOException e){
e.printStackTrace();}}}