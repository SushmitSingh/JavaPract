/* Copying Files-->

Files class copy (Path source , Path target, CopyOption... option)
method can copy the specified source path to the specified target path.

If te specified source file is a symbolic link , the target of the
symbolic link is copied, not the symbolic link.

If the specified  source file is a directory , an empty directory
at the target location is created without copying the contents of the directory

Wo con specify one or more of the following copy options with the copy() method.

StandardCopyOption.REPLACE_EXISTIGN
StandardCopyOption.COPY_ATTRIBUTES
LinkOption.NOFOLLW_LINKES

We can specify the REPLACE_EXISTIGN option to replace the existing target file.

If the target file is a symbolic  link and if it exists, the symbolic link is replaced by 
specifying the REPLACE_EXISTIGN option ,not the target of the symbolic link.

The Copy_ATTRIBUTES option copies the attributes  of the source file to the target file.

If the NOFOLLW_LINKES option is used , the copy() method copies the symbolic 
link, not the target of the symbolic link */

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.DirectoryNotEmptyException;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import static java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;	
public class CopyFile{
	public static void main(String ... args){
		Path source =Paths.get("E:anand\\anand.txt");
		Path target=Paths.get("E:anand \\ anandbind.txt");
		try{
			Path p=Files.copy(source, target,REPLACE_EXISTING,COPY_ATTRIBUTES);
		System.out.println(source+ " hs been copied to " +p);}
		catch (FileAlreadyExistsException e){
		System.out.println(target +" already exists.");}
		catch(DirectoryNotEmptyException e){
		System.out.println(target + " is not empty");}
		catch(IOException e){
e.printStackTrace();}}}