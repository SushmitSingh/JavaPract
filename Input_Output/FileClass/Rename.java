import java.io.File;
public class Rename{
public static  void main(String... args){
File oldFile=new File("CWD.class");
File newFile=new File("newFile.class");
boolean fileRenamed=oldFile.renameTo(newFile);
if(fileRenamed){
System.out.println(oldFile+" renamed to"+newFile);}
else{
System.out.println("Renaming "+oldFile+"to "+newFile+"Failed");}}}