/* 
 Content Type of a File
Files.probeContentType(Path path) method probes the content type of a file.

The method returns the content type in the string from of the 
if the content type of a file connot be determined, it returns value of a multipurpose internet  mail 
Extension (MIME) content type>
null */

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
public class ContentTypeEx{
	public static void main(String... args){
		// Path p=Paths.get("E:\\anand\\anand.txt");
		// Path p=Paths.get("E:\\anand\\anand.pdf");
		Path p=Paths.get("E:\\anand\\anand.html");
		//Path p=Paths.get("E:\\anand\\anand.doc");
		try{
			String contentType=Files.probeContentType(p);
		System.out.format("Content type of %s  in %s%n",p,contentType);}
		catch(IOException e){
e.printStackTrace();}}}
		